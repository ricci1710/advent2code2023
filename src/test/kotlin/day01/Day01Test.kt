package day01

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day01Test {
  private val demoDay = Day01(1, true)
  private val lifeDay = Day01(1, false)

  @Test
  fun `calculate solution for part one`() {
    var expected = 0
    var actual = demoDay.calcPartOne()
    Assertions.assertEquals(expected, actual)

    // Life-Data
    expected = 0
    actual = lifeDay.calcPartOne()
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun `calculate solution for part two`() {
    val expected = 0
    val actual = lifeDay.calcPartTwo()
    Assertions.assertEquals(expected, actual)
  }
}