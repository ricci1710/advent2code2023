package day15

import base.Day

class Day15(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  /**
   * The current value starts at 0.
   * The first character is H; its ASCII code is 72.
   * The current value increases to 72.
   * The current value is multiplied by 17 to become 1224.
   * The current value becomes 200 (the remainder of 1224 divided by 256).
   * The next character is A; its ASCII code is 65. The current value increases to 265.
   * The current value is multiplied by 17 to become 4505.
   * The current value becomes 153 (the remainder of 4505 divided by 256).
   * The next character is S; its ASCII code is 83. The current value increases to 236.
   * The current value is multiplied by 17 to become 4012. The current value becomes 172 (the remainder of 4012 divided by 256).
   * The next character is H; its ASCII code is 72. The current value increases to 244.
   * The current value is multiplied by 17 to become 4148. The current value becomes 52 (the remainder of 4148 divided by 256).
   * So, the result of running the HASH algorithm on the string HASH is 52.
   */
  fun holidayASCIIStringHelperAlgorithm(): Int {
    var result = 0
    return result
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @override
   */
  override fun calcPartOne(): Int {
    return 0
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
