package day12

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day12Test {
  private val demoDay = Day12(12, true)
  private val lifeDay = Day12(12, false)

  @Test
  fun `calculate solution for demo data part one`() {
    val expectedDemo = 21
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
  fun parseLine() {
    var lineInfo = demoDay.parseLine("???.### 1,1,3")
    Assertions.assertEquals("???.###", lineInfo.first)
    Assertions.assertEquals("1,1,3", lineInfo.second.joinToString(","))

    lineInfo = demoDay.parseLine(".??..??...?##. 1,1,3")
    Assertions.assertEquals(".??..??...?##.", lineInfo.first)
    Assertions.assertEquals("1,1,3", lineInfo.second.joinToString(","))

    lineInfo = demoDay.parseLine("?#?#?#?#?#?#?#? 1,3,1,6")
    Assertions.assertEquals("?#?#?#?#?#?#?#?", lineInfo.first)
    Assertions.assertEquals("1,3,1,6", lineInfo.second.joinToString(","))

    lineInfo = demoDay.parseLine("????.#...#... 4,1,1")
    Assertions.assertEquals("????.#...#...", lineInfo.first)
    Assertions.assertEquals("4,1,1", lineInfo.second.joinToString(","))

    lineInfo = demoDay.parseLine("????.######..#####. 1,6,5")
    Assertions.assertEquals("????.######..#####.", lineInfo.first)
    Assertions.assertEquals("1,6,5", lineInfo.second.joinToString(","))
  }

  @Test
  fun calcPossibleOrders() {
    var lineInfo = demoDay.parseLine("???.### 1,1,3")
    var possibleOrders = demoDay.calcPossibleOrders(lineInfo)
    Assertions.assertEquals(1, possibleOrders)

    lineInfo = demoDay.parseLine(".??..??...?##. 1,1,3")
    possibleOrders = demoDay.calcPossibleOrders(lineInfo)
    Assertions.assertEquals(4, possibleOrders)

    lineInfo = demoDay.parseLine("?###???????? 3,2,1")
    possibleOrders = demoDay.calcPossibleOrders(lineInfo)
    Assertions.assertEquals(10, possibleOrders)
  }
}