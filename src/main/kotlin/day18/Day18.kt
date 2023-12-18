package day18

import base.Day

class Day18(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  // <Zeile-Y, <MinX, MaxX>> => Distanz = Abs(MinX) + Abs(MaxX)
  private val lagoonPlan: MutableMap<Int, Pair<Int, Int>> = mutableMapOf()
  fun parseCubeInfo(cmd: String): LagoonCubes {
    val cmdParts = cmd.split(" ")
    return LagoonCubes(
      cmdParts[0],
      cmdParts[1].toInt(),
      cmdParts[2].substring(1, cmdParts[2].length - 1)
    )
  }

  private fun digger(startPoint: Pair<Int, Int>, lagoonCubes: LagoonCubes) {
    when (lagoonCubes.direction) {
      "R" -> {
      }
    }
  }
//  private fun digger(startPoint: Pair<Int, Int>, lagoonCubes: LagoonCubes, lagoon: Array2d<Char>): Pair<Int, Int> {
//    return when (lagoonCubes.direction) {
//      "R" -> Pair(startPoint.first, startPoint.second + lagoonCubes.hub)
//      "L" -> Pair(startPoint.first, startPoint.second - lagoonCubes.hub)
//      "U" -> Pair(startPoint.first - lagoonCubes.hub, startPoint.second)
//      "D" -> Pair(startPoint.first + lagoonCubes.hub, startPoint.second)
//      else -> {
//        throw IllegalArgumentException("Direction (${lagoonCubes.direction}) not found!")
//      }
//    }
//  }

  private fun diggerLagoon() {
    var diggerPoint = Pair<Int, Int>(0, 0);
    storeData.forEach { line ->
      val lagoonCubes = parseCubeInfo(line)
      digger(diggerPoint, lagoonCubes)
      println(diggerPoint.toString())
    }

    println(lagoonPlan.toString())
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    diggerLagoon()
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

data class LagoonCubes(val direction: String, val hub: Int, val rgb: String)
