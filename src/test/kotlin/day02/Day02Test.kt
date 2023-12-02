package day02

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day02Test {
  private val demoDay = Day02(2, true, PlayData(12, 13, 14))
  private val lifeDay = Day02(2, false, PlayData(12, 13, 14))

  @Test
  fun `calculate solution for part one`() {
    val expectedDemo = 8 // demo data from part 2
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)

    // Life-Data
    val expectedLife = 255
    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
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