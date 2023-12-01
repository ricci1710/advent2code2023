package day02

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day02Test {
  private val demoDay = Day02(2, true)
  private val lifeDay = Day02(2, false)

  @Test
  fun `calculate solution for part one`() {
    var expected = 0 // demo data from part 2
    var actual = demoDay.calcPartOne()
    Assertions.assertEquals(expected, actual)

    // Life-Data
    expected = 0
    actual = lifeDay.calcPartOne()
    Assertions.assertEquals(expected, actual)
  }

  /**
   * Spelled out with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
   */
  @Test
  fun `calculate solution for part two`() {
    var expected = 0
    var actual = demoDay.calcPartTwo()
    Assertions.assertEquals(expected, actual)

    expected = 0
    actual = lifeDay.calcPartTwo()
    Assertions.assertEquals(expected, actual)
  }
}