package day06

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day06Test {
  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 288L
    val demoDay = Day06(6, true)
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part one`() {
    // Life-Data
    val expectedLife = 1660968L
    val lifeDay = Day06(6, false)
    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  @Test
  fun `calculate solution for demo data part two`() {
    val expectedDemo = 71503L
    val demoDay = Day06(6, true)
    val actualDemo = demoDay.calcPartTwo()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part two`() {
    val expectedLife = 26499773L
    val lifeDay = Day06(6, false)
    val actualLife = lifeDay.calcPartTwo()
    Assertions.assertEquals(expectedLife, actualLife)
  }
}