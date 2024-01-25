package day16

import base.Day
import util.Array2d

class Day16(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    val opticalBoard = Array2d<Char>(storeData.size, storeData[0].length, '.')
    opticalBoard.add(4, 2, '#')
    println(opticalBoard.toString())
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
