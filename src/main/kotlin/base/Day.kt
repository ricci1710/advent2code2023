package base

import java.io.File

abstract class Day(dayNumber: Int, loadDemoData: Boolean) {
  protected var storeData: List<String>

  // Calls a given block callback, giving it a sequence of all the lines in a file.
  private fun readFileAsLinesUsingUseLines(fileName: String): List<String> = File(fileName).useLines { it.toList() }

  init {
    storeData = if (loadDemoData) {
      if (dayNumber < 10)
        readFileAsLinesUsingUseLines("./src/test/kotlin/day0$dayNumber/DemoData0$dayNumber.bin")
      else
        readFileAsLinesUsingUseLines("./src/test/kotlin/day$dayNumber/DemoData$dayNumber.bin")
    } else {
      if (dayNumber < 10)
        readFileAsLinesUsingUseLines("./src/test/kotlin/day0$dayNumber/LifeData0$dayNumber.bin")
      else
        readFileAsLinesUsingUseLines("./src/test/kotlin/day$dayNumber/LifeData$dayNumber.bin")
    }
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Int}
   * @abstract
   */
  abstract fun calcPartOne(): Int

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Int}
   * @abstract
   */
  abstract fun calcPartTwo(): Int
}