package day12

import base.Day

class Day12(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  fun parseLine(line: String): Pair<String, List<Int>> {
    var lineParts = line.split(" ")
    var springField = lineParts[0]
    var orderList: List<Int> = lineParts[1].split(",")
      .map { it.trim().toInt() }
      .toList()

    return Pair(springField, orderList)
  }

  fun calcPossibleOrders(lineInfo: Pair<String, List<Int>>): Int {
    var springField = lineInfo.first
    val unknownSprings = springField
    return 0
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
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
