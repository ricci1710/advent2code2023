package day20

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day20Test {
  private val lifeDay = Day20(20, false, "")

  @Test
  fun `calculate solution for demo data part one example a`() {
    val demoDay = Day20(20, true, "a")
    val expectedDemo = 32000000
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for demo data part one example b`() {
    val demoDay = Day20(20, true, "b")
    val expectedDemo = 11687500
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
    val demoDay = Day20(20, true, "a")
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