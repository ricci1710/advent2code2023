package day04

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day04Test {
  private val demoDay = Day04(4, true)
  private val lifeDay = Day04(4, false)

  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 13
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part one`() {
    // Life-Data
    val expectedLife = 25174
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
  fun parse() {
    val line = " 93  7  9 11 12 13 79 51 99 62 | 99 28 51 12 82 11 35 18 93 34  7 17  2 13 63 54  9 69 62 84 68 79 58 36 70"
    val regEx = Regex("\\s+")
    val cardStacks = line.split("|")
    val cardStack1 = cardStacks[0].trim().split(regEx).toList()
    val cardStack2 = cardStacks[1].trim().split(regEx).toList()

    Assertions.assertEquals(10, cardStack1.size)
    Assertions.assertEquals(25, cardStack2.size)
  }
}