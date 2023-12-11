package day04

import base.Day

class Day04(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private var scratchCardsCounter = mutableMapOf<Int, Int> ()

  private fun calc(callback: (lineNo:Int, findCards:List<String>) -> Int): Int {
    var result = 0

    for (lineNo in storeData.indices) {
      val (cardStack1, cardStack2) = getCardStacks(storeData[lineNo])
      val findCards = cardStack2.filter { item -> item in cardStack1 }
      result += callback(lineNo+1, findCards) // we start with card number 1
    }

    return result
  }

  private fun calcCardPoints(lineNo: Int, findCards:List<String>):Int {
    var cardPoints = 0
    for (i in findCards.indices) {
      if (i == 0)
        cardPoints = 1
      else
        cardPoints *= 2
    }

    return cardPoints
  }

  private fun calcScratchCardsScore(lineNo: Int, findCards:List<String>):Int {
    incrementScratchCardsScore(lineNo)

    val matching = findCards.size

    val count = scratchCardsCounter[lineNo]

//    for (nextLineNo in 0..matching) {
//      incrementScratchCardsScore(lineNo + nextLineNo)
//    }

    return 0
  }

  fun incrementScratchCardsScore(lineNo: Int) {
    if (scratchCardsCounter.containsKey(lineNo)) {
      scratchCardsCounter[lineNo] = scratchCardsCounter[lineNo]!! + 1
    } else {
      scratchCardsCounter[lineNo] = 1
    }
  }

  private fun getCardStacks(line:String): Pair<List<String>,List<String>> {
    val regEx = Regex("\\s+")

    val cardStacks = line.split(":")[1].split("|")
    val cardStack1 = cardStacks[0].trim().split(regEx).toList()
    val cardStack2 = cardStacks[1].trim().split(regEx).toList()

    return Pair(cardStack1, cardStack2)
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    return calc { lineNo, findCards -> calcCardPoints(lineNo,findCards) }
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartTwo(): Int {
    var result = 0
    calc { lineNo, findCards -> calcScratchCardsScore(lineNo, findCards) }
    for (value in scratchCardsCounter.values) {
      result += value
    }
    return result
  }
}
