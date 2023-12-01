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

    expected = 0
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
}