package day01

import base.Day

class Day01(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private fun calcCalibration(calcCalibration: List<String>): Int {
    var calibrationCode = 0
    calcCalibration.forEach { line -> calibrationCode += findCalibrationCode(line) }
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
    return calcCalibration(storeData)
  }
}