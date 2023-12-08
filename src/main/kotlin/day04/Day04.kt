package day04

import base.Day

class Day04(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private fun calc(): Int {
    var result = 0

    storeData.forEach {
      val cardStacks = it.split(":")[1].split("|")
      val (cardStack1, cardStack2) = getCardStacks(it)
//      val cardStack1 = cardStacks[0].trim().split(regEx).toList()
//      val cardStack2 = cardStacks[1].trim().split(regEx).toList()

      val findCards = cardStack2.filter { item -> item in cardStack1 }
      var cardPoints = 0
      for (i in findCards.indices) {
        if (i == 0)
          cardPoints = 1
        else
          cardPoints *= 2
      }
      result += cardPoints
    }
    return result
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
