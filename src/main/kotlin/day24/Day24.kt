package day24

import base.Day
import util.StraightLine

class Day24(dayNumber: Int, loadDemoData: Boolean, private val min: Long, private val max: Long) : Day(dayNumber, loadDemoData) {
  private val infoData: MutableList<InfoData> = mutableListOf()
  private fun createDataFromInput() {
    storeData.forEach { line ->
      val lineParts = line.split("@")
      val coordinates = lineParts[0].split(",")
      val velocities = lineParts[1].split(",")

      val x = coordinates[0].trim()
      val y = coordinates[1].trim()
      val vx = velocities[0].trim().toInt()
      val vy = velocities[1].trim().toInt()

      val p1 = StraightLine.Point(x.toDouble(), y.toDouble())
      val p2 = StraightLine.Point(x.toDouble() + vx, y.toDouble() + vy)

      val info = InfoData(
        x.toLong(),
        y.toLong(),
        coordinates[2].trim().toLong(),
        vx,
        vy,
        velocities[2].trim().toInt(),
        StraightLine(p1, p2)
      )

      infoData.add(info)
    }
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    createDataFromInput()
    var res = 0
    while (infoData.size > 2) {
      val testInfoDataA = infoData.removeAt(0)
      infoData.forEach { testInfoDataB ->
        val intersection = testInfoDataA.straightLine.intersection(testInfoDataB.straightLine)
        if (checkIntersectionInRange(testInfoDataA, testInfoDataB, intersection))
          res += 1
      }
    }
    return res
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartTwo(): Int {
    return 0
  }

  private fun checkIntersectionInRange(
    testInfoDataA: InfoData,
    testInfoDataB: InfoData,
    intersection: StraightLine.Point,
  ): Boolean {
    // Hailstones' paths crossed in the past for hailstone A
    // anhand der Geschwindigkeit schauen, ob der Punkt in Vergangenheit liegt
    if (testInfoDataA.xVelocity < 0 && intersection.x > testInfoDataA.xCoordinate)
      return false
    else if (testInfoDataA.xVelocity > 0 && intersection.x < testInfoDataA.xCoordinate)
      return false
    // Hailstones' paths crossed in the past for hailstone A
    // anhand der Geschwindigkeit schauen, ob der Punkt in Vergangenheit liegt
    else if (testInfoDataB.xVelocity < 0 && intersection.x > testInfoDataB.xCoordinate)
      return false
    else if (testInfoDataB.xVelocity > 0 && intersection.x < testInfoDataB.xCoordinate)
      return false

    return intersection.x >= min && intersection.x <= max && intersection.y >= min && intersection.y <= max
  }

  data class InfoData(
    val xCoordinate: Long,
    val yCoordinate: Long,
    val zCoordinate: Long,
    val xVelocity: Int,
    val yVelocity: Int,
    val zVelocity: Int,
    var straightLine: StraightLine
  )

}

