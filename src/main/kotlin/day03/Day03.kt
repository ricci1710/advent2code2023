package day03

import base.Day

class Day03(dayNumber: Int, loadDemoData: Boolean, postFix: String = "") : Day(dayNumber, loadDemoData, postFix) {
  //<editor-fold desc="Solution Part One">
  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    return calc()
  }

  private fun calc(): Int {
    var lineIndex = 0
    var result = 0

    storeData.forEach { line ->
      result += calculateLine(lineIndex, line)
      lineIndex += 1
    }
    return result
  }

  private fun calculateLine(lineIndex: Int, line: String): Int {
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
        result += item?.value?.toInt() ?: 0
    }

    return result
  }

  fun checkPrevOrNextLine(matchGroup: MatchGroup, line: String): Boolean {
    if (line.isEmpty())
      return false

    val position = getStartAndEndPosition(line, matchGroup)

    val subLine = line.subSequence(position.first, position.second + 1)
      .toList()
      .filter { it != '.' }

    return subLine.isNotEmpty()
  }

  private fun checkCurrLine(matchGroup: MatchGroup, line: String): Boolean {
    if (line.isEmpty())
      return false

    val position = getStartAndEndPosition(line, matchGroup)
    val subLine = line.subSequence(position.first, position.second + 1)
    val charStart = subLine[0]
    val charEnd = subLine[subLine.length - 1]

    return isSymbol(charStart) || isSymbol(charEnd)
  }

  //</editor-fold>
  //<editor-fold desc="Solution Part Tow">
  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartTwo(): Int {
    return calcVersion2()
  }

  private fun calcVersion2(): Int {
    var lineIndex = 0
    var result = 0

    storeData.forEach { line ->
      result += calculateLineVersion2(lineIndex, line)
      lineIndex += 1
    }
    return result
  }

  private fun calculateLineVersion2(lineIndex: Int, line: String): Int {
    val prevIdx = lineIndex - 1
    val nextIdx = lineIndex + 1
    val gearList = getGear(line)

    if (gearList.isEmpty())
      return 0

    val prevLine = if (prevIdx < 0) "" else storeData[prevIdx]
    val nextLine = if (nextIdx >= storeData.size) "" else storeData[nextIdx]

    var result = 0
    gearList.forEach {
      val position = it!!.range.first.toInt()
      result += checkCurrentLine(position, line)                   // rechts & links
      result += checkPrevAndNextLine(position, prevLine, line)     // oben & aktuelle Zeile
      result += checkPrevAndNextLine(position, line, nextLine)     // aktuelle Zeile & unten
      result += checkPrevAndNextLine(position, prevLine, nextLine) // oben & unten
    }

    return result
  }

  /**
   * z.B.: ".831*61..23*4...388" => GearPos = 4
   */
  fun checkCurrentLine(position: Int, line: String): Int {
    val matchGroup = getMatchGroup(line)

    var number1 = 0
    var number2 = 0

    matchGroup.forEach {
      val range = it?.range ?: IntRange(-1, -1)
      if (number1 == 0 && (position - 1 in range)) // Rechts
        number1 = it!!.value.toInt()
      else if (position + 1 in range)              // oder links vom Stern
        number2 = it!!.value.toInt()
    }

    return number1 * number2
  }

  private fun checkPrevAndNextLine(position: Int, prevLine: String, nextLine: String): Int {
    val startPos = if (position > 0) position - 1 else position
    val endPos = if (position < prevLine.length - 1) position + 1 else position
    val rangeFromGear = startPos..endPos

    val matchResultsPrev = searchForNumbersInRange(position, rangeFromGear, prevLine)
    val matchResultsNext = searchForNumbersInRange(position, rangeFromGear, nextLine)

    if (matchResultsPrev.isEmpty() || matchResultsNext.isEmpty())
      return 0;

    val number1 = matchResultsPrev[position]?.value?.toInt() ?: 0
    val number2 = matchResultsNext[position]?.value?.toInt() ?: 0

    return number1 * number2
  }

  private fun searchForNumbersInRange(position: Int, rangeFromGear: IntRange, line: String): MutableMap<Int, MatchGroup> {
    val matchGroupPrevLine = getMatchGroup(line)
    val matchResults: MutableMap<Int, MatchGroup> = mutableMapOf()

    matchGroupPrevLine.forEach {
      val rangeFromNumber = it?.range!!
      val numberInRange = isInRange(rangeFromNumber, rangeFromGear)
      if (numberInRange)
        matchResults[position] = it
    }

    return matchResults
  }

  fun isInRange(range1: IntRange, range2: IntRange): Boolean {
    val rstart1 = range1.first
    val rend1 = range1.last
    val rstart2 = range2.first
    val rend2 = range2.last

    return (rstart1 in rstart2..rend2) || (rstart2 in (rstart1 + 1)..rend1)
  }

  private fun getGear(line: String): List<MatchGroup?> {
    return Regex("(\\*)").findAll(line)
      .map(MatchResult::groups)
      .map { it[0] }
      .toList()
  }

  //</editor-fold>
  private fun getStartAndEndPosition(line: String, matchGroup: MatchGroup): Pair<Int, Int> {
    val startPos = if (matchGroup.range.first > 0) matchGroup.range.first - 1 else matchGroup.range.first
    val endPos = if (matchGroup.range.last < line.length - 1) matchGroup.range.last + 1 else matchGroup.range.last

    return Pair(startPos, endPos)
  }

  private fun isSymbol(char: Char): Boolean {
    return !char.isDigit() && char != '.'
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
