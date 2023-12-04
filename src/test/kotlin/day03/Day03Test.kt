package day03

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day03Test {
  private val demoDay = Day03(3, true)
  private val lifeDay = Day03(3, false)

  @Test
  fun `calculate solution for part one`() {
    val expectedDemo = 4361 // demo data from part 2
    val actualDemo = demoDay.calcPartOne()
    Assertions.assertEquals(expectedDemo, actualDemo)

    // Life-Data
    val expectedLife = 546563
    val actualLife = lifeDay.calcPartOne()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  /**
   * Spelled out with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
   */
  @Test
  fun `calculate solution for demo data part two`() {
    val expectedDemo = 467835
    val actualDemo = demoDay.calcPartTwo()
    Assertions.assertEquals(expectedDemo, actualDemo)
  }

  @Test
  fun `calculate solution for life data part two`() {
    val expectedLife = 86192975
    val actualLife = lifeDay.calcPartTwo()
    Assertions.assertEquals(expectedLife, actualLife)
  }

  @Test
  fun `get the numbers and positions in a string line back`() {
    val matchGroup1 = demoDay.getMatchGroup("467..114..")

    val number1 = demoDay.getNumber(0, matchGroup1)
    val range1 = matchGroup1[0]?.range.toString()
    Assertions.assertEquals(467, number1)
    Assertions.assertEquals((0..2).toString(), range1)

    val number2 = demoDay.getNumber(1, matchGroup1)
    val range2 = matchGroup1[1]?.range.toString()
    Assertions.assertEquals(114, number2)
    Assertions.assertEquals((5..7).toString(), range2)

    val matchGroup2 = demoDay.getMatchGroup("......#...")
    Assertions.assertEquals(0, matchGroup2.size)
  }

  @Test
  fun checkPrevOrNextLine() {
    var matchGroup = MatchGroup("467", (0..2))
    var checked = demoDay.checkPrevOrNextLine(matchGroup, "467..114..")
    Assertions.assertTrue(checked)

    matchGroup = MatchGroup("114", (5..7))
    checked = demoDay.checkPrevOrNextLine(matchGroup, "467..114..")
    Assertions.assertTrue(checked)

    matchGroup = MatchGroup("11", (8..9))
    checked = demoDay.checkPrevOrNextLine(matchGroup, "617*....11")
    Assertions.assertTrue(checked)
  }

  @Test
  fun isInRange() {
    var inRange = demoDay.isInRange(1..4, 2..3)
    Assertions.assertTrue(inRange)

    inRange = demoDay.isInRange(2..3, 2..3)
    Assertions.assertTrue(inRange)

    inRange = demoDay.isInRange(3..6, 2..3)
    Assertions.assertTrue(inRange)

    inRange = demoDay.isInRange(5..6, 2..3)
    Assertions.assertFalse(inRange)

    inRange = demoDay.isInRange(1..2, 3..4)
    Assertions.assertFalse(inRange)
  }

  @Test
  fun checkCurrentLine() {
    var number = demoDay.checkCurrentLine(4, ".831*61..23*4...388")
    Assertions.assertEquals(50691, number)

    number = demoDay.checkCurrentLine(4, ".831*.61..23*4...388")
    Assertions.assertEquals(0, number)

    number = demoDay.checkCurrentLine(12, ".831*.61..23*4...388")
    Assertions.assertEquals(92, number)
  }

  @Test
  fun `test special file LifeData03a`() {
    val lifeDemoDay = Day03(3, false, "a")

    var result = lifeDemoDay.calcPartTwo()
    Assertions.assertEquals(760040, result)
  }
}