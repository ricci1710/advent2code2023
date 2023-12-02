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
    val expectedLife = 2006
    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  /**
   * Spelled out with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
   */
  @Test
  fun `calculate solution for part two`() {
    val expectedDemo = 2286
    val actualDemo = demoDay.calcPartTwo()
    Assertions.assertEquals(expectedDemo, actualDemo)

    val expectedLife = 84911
    val actualLife = lifeDay.calcPartTwo()
    Assertions.assertEquals(expectedLife, actualLife)
  }
}