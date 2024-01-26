package day06

import base.Day

class Day06(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private val gameList = mutableListOf<TimeAndDistance>()
  private val timeAndDistancePart2 = TimeAndDistance(0, 0)

  init {
    val timeLine = Regex("[0-9]+").findAll(storeData[0])
      .map(MatchResult::value)
      .toList()
      .map { it.toLong() }

    val distanceLine = Regex("[0-9]+").findAll(storeData[1])
      .map(MatchResult::value)
      .toList()
      .map { it.toLong() }

    if (timeLine.size !== distanceLine.size)
      throw IllegalArgumentException("timeLine.size !== distanceLine.size is not allowd")

    timeAndDistancePart2.time = timeLine.reduce { acc, vale -> (acc.toString() + vale.toString()).toLong() }
    timeAndDistancePart2.distance = distanceLine.reduce { acc, vale -> (acc.toString() + vale.toString()).toLong() }

    for (idx in timeLine.indices) {
      gameList.add(TimeAndDistance(timeLine[idx], distanceLine[idx]))
    }
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    var result = 1L
    gameList.forEach { timeAndDistance ->
      var times = 0
      for (idx in 1..timeAndDistance.time) {
        val distance = idx * (timeAndDistance.time - idx)
        if (distance > timeAndDistance.distance)
          times += 1
      }
      result *= times
    }
    return result
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartTwo(): Long {
    var result = 0L

    for (idx in 1..timeAndDistancePart2.time) {
      val distance = idx * (timeAndDistancePart2.time - idx)
      if (distance > timeAndDistancePart2.distance)
        result += 1
    }
    return result
  }
}

data class TimeAndDistance(var time: Long, var distance: Long)