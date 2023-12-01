package day01

import base.Day

class Day01(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private fun calcCalibration(calcCalibration: List<String>): Int {
    var calibrationCode = 0
    calcCalibration.forEach { line ->
      val lineCode = findCalibrationCode(line)
      println(lineCode)
      calibrationCode += lineCode
    }
    return calibrationCode
  }

  private fun calcCalibrationVersion2(calcCalibration: List<String>): Int {
    var calibrationCode = 0
    calcCalibration.forEach { line ->
      val lineCode = findCalibrationCodeVersion2(line)
      calibrationCode += lineCode
    }
    return calibrationCode
  }

  fun findCalibrationCode(line: String): Int {
    val lineNumbers = line.toCharArray()
      .toList()
      .filter { char -> char.isDigit() }

    if (lineNumbers.isEmpty())
      return 0
    else
      return (lineNumbers.first().toString() + lineNumbers.last().toString()).toInt()
  }

  /**
   * Spelled out with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
   */
  fun findCalibrationCodeVersion2(line: String): Int {
    // all digits from spelling
    val spellNumbers = Regex("(?=(one|two|three|four|five|six|seven|eight|nine))").findAll(line)
      .map(MatchResult::groupValues)
      .map { it[1] }
      .toList()

    // all digits from string
    val digitNumbers = Regex("1|2|3|4|5|6|7|8|9").findAll(line)
      .map(MatchResult::value)
      .toList()

    var posSpell = Int.MAX_VALUE
    var posDigit = Int.MAX_VALUE

    // find first pos of spellNumbers
    if (spellNumbers.isNotEmpty())
      posSpell = line.indexOf(spellNumbers[0])

    // find first pos of digitNumbers
    if (digitNumbers.isNotEmpty())
      posDigit = line.indexOf(digitNumbers[0])

    if (posSpell == -1 && posDigit == -1)
      return 0

    val digitOne = if (posDigit < posSpell) digitNumbers[0] else getDigit(spellNumbers[0])

    posSpell = -1
    posDigit = -1

    // find last pos of spellNumbers
    if (spellNumbers.isNotEmpty())
      posSpell = line.lastIndexOf(spellNumbers.last())

    // find last pos of digitNumbers
    if (digitNumbers.isNotEmpty())
      posDigit = line.lastIndexOf(digitNumbers.last())

    val digitTwo = if (posDigit > posSpell) digitNumbers.last() else getDigit(spellNumbers.last())

    return (digitOne + digitTwo).toInt()
  }

  private fun getDigit(spellNumber: String): String {
    return when (spellNumber) {
      "one" -> "1"
      "two" -> "2"
      "three" -> "3"
      "four" -> "4"
      "five" -> "5"
      "six" -> "6"
      "seven" -> "7"
      "eight" -> "8"
      "nine" -> "9"
      else -> "0"
    }
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    return calcCalibration(storeData)
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartTwo(): Int {
    return calcCalibrationVersion2(storeData)
  }
}