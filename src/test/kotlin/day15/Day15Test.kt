package day15

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day15Test {
  private val demoDay = Day15(15, true)
  private val lifeDay = Day15(15, false)

  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 1320
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

    @Test
    fun `test the holiday ASCII String Helper Algorithm`() {
      var actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("H")
      Assertions.assertEquals(200, actualDemo)

      actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("HASH")
      Assertions.assertEquals(52, actualDemo)
    }
}