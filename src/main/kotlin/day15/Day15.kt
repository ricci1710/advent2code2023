package day15

import base.Day

class Day15(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  /**
   * 1. Determine the ASCII code for the current character of the string.
   * 2. Increase the current value by the ASCII code you just determined.
   * 3. Set the current value to itself multiplied by 17.
   * 4. Set the current value to the remainder of dividing itself by 256.
   */
  fun holidayASCIIStringHelperAlgorithm(stepCode: String): Int {
    // start with a current value of 0
    var hashCode = 0
    stepCode.toList()
      .forEach { sign ->
        // Determine the ASCII code for the current character of the string.
        // Increase the current value by the ASCII code you just determined.
        hashCode += sign.code.toByte().toInt()
        // Set the current value to itself multiplied by 17.
        hashCode *= 17
        // Set the current value to the remainder of dividing itself by 256.
        hashCode %= 256
      }
    return hashCode
  }

  fun parseSequence(sequence: String): List<String> {
    return sequence.split(",").toList()
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    var result = 0L
    val sequence = storeData[0]
    val sequenceSteps = parseSequence(sequence)
    sequenceSteps.forEach { sequenceStep ->
      result += holidayASCIIStringHelperAlgorithm(sequenceStep)
    }
    return result
  }

  fun getLensInfo(sequenceStep: String): LensInfo {
    var lensParts = listOf<String>()
    val lensInfo: LensInfo

    if (sequenceStep.indexOf("-") >= 0) {
      lensParts = sequenceStep.split("-")
      lensInfo = LensInfo(lensParts[0], "-")
    } else {
      lensParts = sequenceStep.split("=")
      lensInfo = LensInfo(lensParts[0], "=", lensParts[1].toInt())
    }

    return lensInfo
  }

  fun deleteLensFromBox(boxNo: Int, key: String, lensBoxes: MutableMap<Int, MutableMap<String, LensInfo>>) {
    val box = lensBoxes[boxNo]!!
    box.remove(key)
  }

  fun insertOrUpdateLensFromBox(boxNo: Int, lensInfo: LensInfo, lensBoxes: MutableMap<Int, MutableMap<String, LensInfo>>) {
    val box = lensBoxes[boxNo]!!
    box[lensInfo.label] = lensInfo
  }

  private fun calculateFocusingPower(lensBoxes: MutableMap<Int, MutableMap<String, LensInfo>>): Long {
    var result = 0L

    lensBoxes.forEach { (key, value) ->
      val multiplierBox = key + 1
      var multiplierSlot = 1
      for (lensInfo in value.values) {
        result += multiplierBox * multiplierSlot * lensInfo.lensFocus!!
        multiplierSlot += 1
      }
    }

    return result
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartTwo(): Long {
    val sequence = storeData[0]
    // <BoxNo, <Lens-Label, Lens-Info>>
    val lensBoxes = mutableMapOf<Int, MutableMap<String, LensInfo>>()
    for (boxNo in 0..255)
      lensBoxes[boxNo] = mutableMapOf()

    val sequenceSteps = parseSequence(sequence)
    sequenceSteps.forEach { sequenceStep ->
      val lensInfo = getLensInfo(sequenceStep)
      val boxNo = holidayASCIIStringHelperAlgorithm(lensInfo.label)
      if (lensInfo.operator == "-")
        deleteLensFromBox(boxNo, lensInfo.label, lensBoxes)
      else
        insertOrUpdateLensFromBox(boxNo, lensInfo, lensBoxes)
    }

    return calculateFocusingPower(lensBoxes)
  }
}

data class LensInfo(val label: String, val operator: String, val lensFocus: Int? = null)
