package day04

import base.Day

class Day04(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  fun calc(): Int {
    var result = 0
    val regEx = Regex("\\s+")

    storeData.forEach {
      val cardStacks = it.split(":")[1].split("|")
      val cardStack1 = cardStacks[0].trim().split(regEx).toList()
      val cardStack2 = cardStacks[1].trim().split(regEx).toList()

      val findCards = cardStack2.filter { item -> item in cardStack1 }
      var cardPoints = 0
      for (i in 0..<findCards.size) {
        if (i == 0)
          cardPoints = 1
        else
          cardPoints *= 2
      }
      result += cardPoints
    }
    return result
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
