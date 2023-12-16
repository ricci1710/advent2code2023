package day15

import base.Day

class Day15(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  /**
   * 1. Determine the ASCII code for the current character of the string.
   * 2. Increase the current value by the ASCII code you just determined.
   * 3. Set the current value to itself multiplied by 17.
   * 4. Set the current value to the remainder of dividing itself by 256.
   */
  fun holidayASCIIStringHelperAlgorithm(stepCode:String): Int {
    // start with a current value of 0
    var hashCode = 0
    stepCode.toList()
      .forEach{sign ->
        // Determine the ASCII code for the current character of the string.
        // Increase the current value by the ASCII code you just determined.
        hashCode += sign.code.toByte().toInt()
        // Set the current value to itself multiplied by 17.
        hashCode *= 17
        // Set the current value to the remainder of dividing itself by 256.
        hashCode %= 256
      }
    return hashCode
  }

  fun parseSequence(sequence:String):List<String> {
    return sequence.split(",").toList()
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    var result = 0
    val sequence = storeData[0]
    val sequenceSteps = parseSequence(sequence)
    sequenceSteps.forEach{sequenceStep ->
      result += holidayASCIIStringHelperAlgorithm(sequenceStep)
    }
    return result
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
