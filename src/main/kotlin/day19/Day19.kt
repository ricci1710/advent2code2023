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

        val workflowInstruction = WorkflowInstruction()
        for (no in instructionParts.indices) {
            val step = instructionParts[no]
            when (no) {
                0 -> workflowInstruction.instruction0 = createInstruction(step)
                1 -> workflowInstruction.instruction1 = createInstruction(step)
                2 -> workflowInstruction.instruction2 = createInstruction(step)
                3 -> workflowInstruction.instruction3 = createInstruction(step)
            }
        }

        workflow[mapKey] = workflowInstruction
        return workflowInstruction
    }

    /**
     * Berechnung der ersten Teilaufgabe
     * @returns {Int}
     * @override
     */
    override fun calcPartOne(): Int {
        splitInputData()
        return 0
    }

    /**
     * Berechnung der zweiten Teilaufgabe
     * @returns {Int}
     * @override
     */
    override fun calcPartTwo(): Int {
        return 0
    }
}

data class WorkflowInstruction(
    var instruction0: Instruction? = null,
    var instruction1: Instruction? = null,
    var instruction2: Instruction? = null,
    var instruction3: Instruction? = null,
)

/**
 * class Instruction(Condition(a<2006) : workflowKey(qkq))
 */
data class Instruction(val condition: Condition?, val workflowKey: String)

/**
 * class Condition (Field(a) Operator(<) Value(2006)), darf auch Null sein!
 */
data class Condition(val field: String, val operator: String, val value: Int)
data class PartRating(val x: Int, val m: Int, val a: Int, val s: Int)