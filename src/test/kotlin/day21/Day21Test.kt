package day21

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day21Test {
  private val demoDay = Day21(21, true)
  private val lifeDay = Day21(21, false)

  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 16
    val actualDemo = demoDay.calcPartOne(6)
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part one`() {
    // Life-Data
    val expectedLife = 0
    val actualLife = lifeDay.calcPartOne(64)
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