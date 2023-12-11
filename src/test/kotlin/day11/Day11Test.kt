package day11

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day11Test {
  private val demoDay = Day11(11, true)
  private val lifeDay = Day11(11, false)

  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 374
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part one`() {
    // Life-Data
    val expectedLife = 0
    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  @Test
  fun `calculate solution for demo data part two`() {
    val expectedDemo = 0
    val actualDemo = demoDay.calcPartTwo()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part two`() {
    val expectedLife = 0
    val actualLife = lifeDay.calcPartTwo()
    Assertions.assertEquals(expectedLife, actualLife)
  }
}