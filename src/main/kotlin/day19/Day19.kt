package day19

import base.Day

class Day19(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private val workflow: MutableMap<String, WorkflowInstruction> = mutableMapOf();
  private val partRating: MutableList<PartRating> = mutableListOf();

  private fun splitInputData() {
    var separatorFound = false
    storeData.forEach { line ->
      if (line.isEmpty())
        separatorFound = true
      else if (separatorFound)
        addPartRating(line)
      else
        addWorkflow(line)
    }
  }

  fun addPartRating(line: String): PartRating {
    val regex = Regex("\\{x=(\\d+),m=(\\d+),a=(\\d+),s=(\\d+)}")

    val matchResult = regex.findAll(line)
      .toList()
      .first()

    if (matchResult.groups.size != 5)
      throw IllegalArgumentException("Buchstaben x,m,a,s nicht gefunden! ($line)")

    val rating = PartRating(
      matchResult.groups[1]!!.value.toInt(),
      matchResult.groups[2]!!.value.toInt(),
      matchResult.groups[3]!!.value.toInt(),
      matchResult.groups[4]!!.value.toInt()
    )

    partRating.add(rating)
    return rating
  }

  fun createInstruction(step: String): Instruction {
    val regEx = Regex("([a-z]+)([><])(\\d+):([a-zAR]+)")

    val instruction: Instruction
    if (regEx.matches(step)) {
      val matchResult = regEx.findAll(step)
        .toList()
        .first()
        .groups

      instruction = when (matchResult.size) {
        5 -> Instruction(
          Condition(
            matchResult[1]!!.value,
            matchResult[2]!!.value,
            matchResult[3]!!.value.toInt(),
          ), matchResult[4]!!.value
        )

        else -> {
          throw IllegalArgumentException("Error::createInstruction()")
        }
      }
    } else
      instruction = Instruction(null, step)


    return instruction
  }

  fun addWorkflow(line: String): WorkflowInstruction {
    val splitLine = line.substring(0, line.length - 1)
      .split("{")

    val mapKey = splitLine[0]
    val instructionParts = splitLine[1].split(",")


    val instruction: MutableList<Instruction> = mutableListOf()
    for (no in instructionParts.indices) {
      val step = instructionParts[no]
      instruction.add(createInstruction(step))
    }

    val workflowInstruction = WorkflowInstruction(instruction)
    workflow[mapKey] = workflowInstruction
    return workflowInstruction
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    splitInputData()

    partRating.forEach { rating ->
      val startSequence = workflow["in"] ?: throw InstantiationException("keyword 'in' in workflow not detected!")
      runWorkflow(0, startSequence, rating)
    }

    return 0L
  }

  fun runWorkflow(sequenceNo: Int, sequence: WorkflowInstruction, rating: PartRating) {
    val (condition, workflowKey) = sequence.instruction[sequenceNo]
    if (condition != null) {
      val (field, operator, value) = condition
      when (field) {
        "x" -> {
          when (operator) {
            ">" -> {
              if (rating.x > value)
                runNextWorkflow(workflowKey, rating)
              else
                nextSequence(sequenceNo, sequence, rating)
            }

            "<" -> {
              if (rating.x < value)
                runNextWorkflow(workflowKey, rating)
              else
                nextSequence(sequenceNo, sequence, rating)
            }

            else -> nextSequence(sequenceNo, sequence, rating)
          }
        }

        "m" -> {
          when (operator) {
            ">" -> rating.m > value
            "<" -> rating.m < value
            else -> nextSequence(sequenceNo, sequence, rating)
          }

        }

        "a" -> {
          when (operator) {
            ">" -> rating.a > value
            "<" -> rating.a < value
            else -> nextSequence(sequenceNo, sequence, rating)
          }

        }

        "s" -> {
          when (operator) {
            ">" -> {
              if (rating.s > value)
                runNextWorkflow(workflowKey, rating)
              else
                nextSequence(sequenceNo, sequence, rating)
            }

            "<" -> {
              if (rating.s < value)
                runNextWorkflow(workflowKey, rating)
              else
                nextSequence(sequenceNo, sequence, rating)
            }

            else -> nextSequence(sequenceNo, sequence, rating)

          }
        }

        else -> {
          throw IllegalArgumentException("")
        }
      }
    } else {
      when (workflowKey) {
        "A" -> Unit
        "R" -> Unit
        else -> {
          runNextWorkflow(workflowKey, rating)
        }
      }
    }

    println(condition)
    println(workflowKey)
  }

  private fun nextSequence(sequenceNo: Int, workflow: WorkflowInstruction, rating: PartRating) {
    val newSequenceNo = sequenceNo + 1
    runWorkflow(newSequenceNo, workflow, rating)
  }

  private fun runNextWorkflow(workflowKey: String, rating: PartRating) {
    val startSequence = workflow[workflowKey] ?: throw InstantiationException("keyword '$workflowKey' in workflow not detected!")
    runWorkflow(0, startSequence, rating)
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartTwo(): Long {
    return 0L
  }
}

data class WorkflowInstruction(var instruction: MutableList<Instruction>)

/**
 * class Instruction(Condition(a<2006) : workflowKey(qkq))
 */
data class Instruction(val condition: Condition?, val workflowKey: String)

/**
 * class Condition (Field(a) Operator(<) Value(2006)), darf auch Null sein!
 */
data class Condition(val field: String, val operator: String, val value: Int)
data class PartRating(val x: Int, val m: Int, val a: Int, val s: Int)