package day06

import base.Day

class Day06(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private val gameList = mutableListOf<TimeAndDistance>()

  init {
    val timeLine = Regex("[0-9]+").findAll(storeData[0])
      .map(MatchResult::value)
      .toList()
      .map { it.toInt() }

    val distanceLine = Regex("[0-9]+").findAll(storeData[1])
      .map(MatchResult::value)
      .toList()
      .map { it.toInt() }

    if (timeLine.size !== distanceLine.size)
      throw IllegalArgumentException("timeLine.size !== distanceLine.size is not allowd")

    for (idx in timeLine.indices) {
      gameList.add(TimeAndDistance(timeLine[idx], distanceLine[idx]))
    }

    println(gameList)
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
        if (distance >= timeAndDistance.distance)
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
    return 0L
  }
}

data class TimeAndDistance(var time: Int, var distance: Int)