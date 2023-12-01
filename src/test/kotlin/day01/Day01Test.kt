package day01

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day01Test {
  private val demoDay = Day01(1, true)
  private val lifeDay = Day01(1, false)

  @Test
  fun `calculate solution for part one`() {
    var expected = 209 // demo data from part 2
    var actual = demoDay.calcPartOne()
    Assertions.assertEquals(expected, actual)

    // Life-Data
    expected = 55477
    actual = lifeDay.calcPartOne()
    Assertions.assertEquals(expected, actual)
  }

  /**
   * Spelled out with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
   */
  @Test
  fun `calculate solution for part two`() {
    var expected = 281
    var actual = demoDay.calcPartTwo()
    Assertions.assertEquals(expected, actual)

    expected = 54431
    actual = lifeDay.calcPartTwo()
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun `find calibration code in line`() {
    var expected = 12
    var actual = demoDay.findCalibrationCode("1abc2")
    Assertions.assertEquals(expected, actual)

    expected = 15
    actual = demoDay.findCalibrationCode("a1b2c3d4e5f")
    Assertions.assertEquals(expected, actual)

    expected = 77
    actual = demoDay.findCalibrationCode("treb7uchet")
    Assertions.assertEquals(expected, actual)

    expected = 0
    actual = demoDay.findCalibrationCode("trebuchet")
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun findCalibrationCodeVersion2() {
    var expected = 29
    var actual = demoDay.findCalibrationCodeVersion2("two1nine")
    Assertions.assertEquals(expected, actual)

    expected = 83
    actual = demoDay.findCalibrationCodeVersion2("eightwothree")
    Assertions.assertEquals(expected, actual)

    expected = 14
    actual = demoDay.findCalibrationCodeVersion2("zoneight234")
    Assertions.assertEquals(expected, actual)

    expected = 22
    actual = demoDay.findCalibrationCodeVersion2("2fvq")
    Assertions.assertEquals(expected, actual)

    expected = 67
    actual = demoDay.findCalibrationCodeVersion2("six97")
    Assertions.assertEquals(expected, actual)

    expected = 44
    actual = demoDay.findCalibrationCodeVersion2("hczsqfour3nxm5seven4")
    Assertions.assertEquals(expected, actual)

    expected = 22
    actual = demoDay.findCalibrationCodeVersion2("2ljplbrsgrjnlktngjd")
    Assertions.assertEquals(expected, actual)

    expected = 22
    actual = demoDay.findCalibrationCodeVersion2("221frgs5nineeightwojj")
    Assertions.assertEquals(expected, actual)
  }
}