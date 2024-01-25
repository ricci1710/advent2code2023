package day02

import base.Day
import kotlin.math.max

class Day02(dayNumber: Int, loadDemoData: Boolean, private val configData: PlayData) : Day(dayNumber, loadDemoData) {

  private fun calc(): Int {
    var result = 0
    storeData.forEach { line ->
      val linePart = line.split(": ")
      val id = getId(linePart[0])
      val playerResult = linePart[1].split(";")
      result += if (check(playerResult).first) id else 0
    }
    return result
  }

  private fun calcVersion2(): Int {
    var result = 0
    storeData.forEach { line ->
      val linePart = line.split(": ")
      val playerResult = linePart[1].split(";")
      val maxColorValues = check(playerResult).second
      result += (maxColorValues.red * maxColorValues.blue * maxColorValues.green)
    }
    return result
  }

  private fun check(playerResult: List<String>): Pair<Boolean, PlayData> {
    val maxColorValues = PlayData(0, 0, 0);

    var isCheckOk = true
    playerResult.forEach { round ->
      var playerDetails = PlayData(0, 0, 0)
      val roundParts = round.split(",")
      roundParts.forEach { part ->
        val valueAndName = getValueAndNameList(part)
        playerDetails = getPlayerDetails(playerDetails, valueAndName)
      }

      maxColorValues.red = max(maxColorValues.red, playerDetails.red)
      maxColorValues.green = max(maxColorValues.green, playerDetails.green)
      maxColorValues.blue = max(maxColorValues.blue, playerDetails.blue)

      isCheckOk = isCheckOk && playerDetails.red <= configData.red && playerDetails.green <= configData.green && playerDetails.blue <= configData.blue
    }

    return Pair(isCheckOk, maxColorValues)
  }

  private fun getId(lineId: String): Int {
    return Regex("[0-9]+").findAll(lineId)
      .map(MatchResult::value)
      .joinToString()
      .toInt()
  }

  private fun getValueAndNameList(part: String): List<Pair<String, Int>> {
    return Regex("([0-9]+) ([a-z]+)").findAll(part)
      .map(MatchResult::groupValues)
      .map { Pair<String, Int>(it[2], it[1].toInt()) }
      .toList()
  }

  private fun getPlayerDetails(player: PlayData, valueAndName: List<Pair<String, Int>>): PlayData {
    valueAndName.forEach { atom ->
      when (atom.first) {
        "red" -> player.red = atom.second
        "green" -> player.green = atom.second
        "blue" -> player.blue = atom.second
      }
    }

    return player
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    return calc().toLong()
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartTwo(): Long {
    return calcVersion2().toLong()
  }
}

data class PlayData(var red: Int, var green: Int, var blue: Int)