package day21

import base.Day
import util.Array2d

class Day21(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private var steps: Int = 0
  private lateinit var gardenPlan: Array2d<Char>

  private fun readGardenPlan() {
    var rowIdx = 0

    gardenPlan = Array2d<Char>(storeData.size, storeData[0].length, '.')
    storeData.forEach {
      gardenPlan.addRowData(rowIdx, it.toCharArray().toList())
      rowIdx += 1
    }
  }

  private fun findStartPoint() {
    val startCoordinate = gardenPlan.find('S')
    println(startCoordinate)
  }

  fun calcPartOne(steps: Int): Int {
    this.steps = steps
    return calcPartOne()
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    readGardenPlan()
    println(gardenPlan.toString())
    findStartPoint()
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
