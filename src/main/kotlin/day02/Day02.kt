package day02

import base.Day

class Day02(dayNumber: Int, loadDemoData: Boolean, val configData: PlayData) : Day(dayNumber, loadDemoData) {

  private fun calc(): Int {
    var result = 0
    storeData.forEach { line ->
      val linePart = line.split(": ")

      val id = Regex("[0-9]+").findAll(linePart[0])
        .map(MatchResult::value)
        .joinToString()
        .toInt()

      val playerResult = linePart[1].split(";")
      result += if (check(id, playerResult)) id else 0
    }
    return result
  }

  private fun check(id: Int, playerResult: List<String>): Boolean {
    val player = PlayData(0, 0, 0)
    var isCheckOk = true

    playerResult.forEach { round ->
      val roundParts = round.split(",")
      roundParts.forEach { part ->
        val valueAndName = Regex("([0-9]+) ([a-z]+)").findAll(part)
          .map(MatchResult::groupValues)
          .map { Pair<String, Int>(it[2], it[1].toInt()) }
          .toList()

        valueAndName.forEach { atom ->
          when (atom.first) {
            "red" -> player.red = atom.second
            "green" -> player.green = atom.second
            "blue" -> player.blue = atom.second
          }
        }

        println("$id: $player")
        isCheckOk = player.red <= configData.red && player.green <= configData.green && player.blue <= configData.blue
      }
    }

    return isCheckOk
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    return calc()
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

data class PlayData(var red: Int, var green: Int, var blue: Int)