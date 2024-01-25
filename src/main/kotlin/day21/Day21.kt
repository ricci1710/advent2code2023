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

  private fun findStartPoint(): Pair<Int, Int> {
    return gardenPlan.find('S')!!
  }

  private fun walkThrough(step: Int, visitedList: MutableMap<Int, MutableList<Coordinate>>): Long {
    println("$step $visitedList")
    return 0L
  }

  fun calcPartOne(steps: Int): Long {
    this.steps = steps
    return calcPartOne()
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    readGardenPlan()
    val startCoordinate = findStartPoint()
    val visitedList: MutableMap<Int, MutableList<Coordinate>> = mutableMapOf()

    visitedList[0] = mutableListOf(Coordinate(startCoordinate.first, startCoordinate.second))
    return walkThrough(1, visitedList)
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

data class Coordinate(var row: Int, var column: Int)
