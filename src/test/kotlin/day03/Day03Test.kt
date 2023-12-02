package day03

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day03Test {
  private val demoDay = Day03(2, true)
  private val lifeDay = Day03(2, false)

  @Test
  fun `calculate solution for part one`() {
    val expectedDemo = 0 // demo data from part 2
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)

    // Life-Data
    val expectedLife = 0
    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  /**
   * Spelled out with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
   */
  @Test
  fun `calculate solution for part two`() {
    val expectedDemo = 0
    val actualDemo = demoDay.calcPartTwo()
    Assertions.assertEquals(expectedDemo, actualDemo)

    val expectedLife = 0
    val actualLife = lifeDay.calcPartTwo()
    Assertions.assertEquals(expectedLife, actualLife)
  }
}