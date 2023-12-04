package base

import java.io.File

abstract class Day(dayNumber: Int, loadDemoData: Boolean, postFix: String = "") {
  private lateinit var fileName: String
  protected var storeData: List<String>

  // Calls a given block callback, giving it a sequence of all the lines in a file.
  private fun readFileAsLinesUsingUseLines(fileName: String): List<String> = File(fileName).useLines { it.toList() }

  init {
    if (postFix.isEmpty())
      fileName = if (dayNumber < 10) "0$dayNumber" else dayNumber.toString()
    else
      fileName = if (dayNumber < 10) "0$dayNumber$postFix" else dayNumber.toString() + postFix

    storeData = if (loadDemoData) {
      if (dayNumber < 10)
        readFileAsLinesUsingUseLines("./src/test/kotlin/day0$dayNumber/DemoData$fileName.bin")
      else
        readFileAsLinesUsingUseLines("./src/test/kotlin/day$dayNumber/DemoData$fileName.bin")
    } else {
      if (dayNumber < 10)
        readFileAsLinesUsingUseLines("./src/test/kotlin/day0$dayNumber/LifeData$fileName.bin")
      else
        readFileAsLinesUsingUseLines("./src/test/kotlin/day$dayNumber/LifeData$fileName.bin")
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