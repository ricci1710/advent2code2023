package day12

import base.Day

class Day12(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  fun parseLine(line: String): Pair<String, List<Int>> {
    val lineParts = line.split(" ")
    val springField = lineParts[0]
    val orderList: List<Int> = lineParts[1].split(",")
      .map { it.trim().toInt() }
      .toList()

    return Pair(springField, orderList)
  }

  fun calcPossibleOrders(lineInfo: Pair<String, List<Int>>): Int {
    val springField = lineInfo.first
    val unknownSprings = Regex("\\?+")
      .findAll(springField)
      .toList()
    println(unknownSprings)
    return 0
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    return 0L
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
