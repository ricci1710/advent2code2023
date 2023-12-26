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
      val testStraightLine = infoData.removeAt(0).straightLine
      infoData.forEach { info ->
        val intersection = testStraightLine.intersection(info.straightLine)
        // time 0ns
        val startPoint = StraightLine.Point(info.xCoordinate.toDouble(), info.yCoordinate.toDouble())
        val endPoint = StraightLine.Point(startPoint.x - info.xVelocity, startPoint.y - info.yCoordinate)

        if (checkIntersectionInRange(startPoint, endPoint, intersection))
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
    startPoint: StraightLine.Point,
    endPoint: StraightLine.Point,
    intersection: StraightLine.Point,
  ): Boolean {
    // Hailstones' paths crossed in the past for hailstone A
    if (intersection.x < startPoint.x)
      return false

    // Hailstones' paths crossed in the past for hailstone B
    if (intersection.x < endPoint.x)
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

