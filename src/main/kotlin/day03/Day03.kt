package day03

import base.Day

class Day03(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private fun calc(): Int {
    var lineIndex = 0

    storeData.forEach { line ->
      check(lineIndex, line)
      lineIndex += 1
    }
    return 0
  }

  private fun check(lineIndex: Int, line: String): Int {
    val prevIdx = lineIndex - 1
    val nextIdx = lineIndex + 1

    val matchGroup = getMatchGroup(line)
    if (matchGroup.isEmpty())
      return 0

    var result = 0
    val prevLine = if (prevIdx >= 0) storeData[prevIdx] else ""
    val nextLine = if (nextIdx < storeData.size) storeData[nextIdx] else ""

    var numberIndex = 0
    matchGroup.forEach { item ->
      var ok = false

      ok = ok || item?.let { checkPrevOrNextLine(it, prevLine) } == true
      ok = ok || item?.let { checkCurrLine(it, line) } == true
      ok = ok || item?.let { checkPrevOrNextLine(it, nextLine) } == true

      if (ok)
        result = item?.value?.toInt() ?: 0
    }

    return result
  }

  fun checkPrevOrNextLine(matchGroup: MatchGroup, prevLine: String): Boolean {
    if (prevLine.isEmpty())
      return false

    val startPos = if (matchGroup.range.first > 0) matchGroup.range.first - 1 else matchGroup.range.first
    val endPos = if (matchGroup.range.last < prevLine.length - 1) matchGroup.range.last + 1 else matchGroup.range.last

    println("$prevLine: $startPos - $endPos")
    return true
  }

  private fun checkCurrLine(matchGroup: MatchGroup, prevLine: String): Boolean {
    return true
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

  fun getMatchGroup(line: String): List<MatchGroup?> {
    return Regex("([0-9]+)").findAll(line)
      .map(MatchResult::groups)
      .map { it[0] }
      .toList()
  }

  fun getNumber(index: Int, matchGroup: List<MatchGroup?>, errorNumber: Int = 0): Int {
    return matchGroup[index]?.value?.toInt() ?: errorNumber
  }
}
