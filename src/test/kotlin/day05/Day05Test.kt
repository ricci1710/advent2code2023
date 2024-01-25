package day05

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day05Test {
  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 35L
    val demoDay = Day05(5, true)

    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part one`() {
    // Life-Data
    val expectedLife = 107430936L
    val lifeDay = Day05(5, false)

    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  @Test
  fun `calculate solution for demo data part two`() {
    val expectedDemo = 46L
    val demoDay = Day05(5, true)

    val actualDemo = demoDay.calcPartTwo()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part two`() {
    val expectedLife = 0L
    val lifeDay = Day05(5, false)

    val actualLife = lifeDay.calcPartTwo()
    Assertions.assertEquals(expectedLife, actualLife)
  }
}