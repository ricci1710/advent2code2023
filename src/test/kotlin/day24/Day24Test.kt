package day24

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day24Test {
  private val demoDay = Day24(24, true, 7, 27)
  private val lifeDay = Day24(24, false, 200000000000000, 400000000000000)

  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 2
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part one`() {
    // Life-Data
    val expectedLife = 16727
    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  @Test
  fun `calculate solution for demo data part two`() {
    val expectedDemo = 47
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