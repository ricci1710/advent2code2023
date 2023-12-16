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
    val expectedLife = 512950
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

      actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("rn=1")
      Assertions.assertEquals(30, actualDemo)
    }

  @Test
  fun `parse start sequence from file`() {
    val actualDemo = demoDay.parseSequence("rn=1,cm-,qp=3,cm=2,qp-,pc=4,ot=9,ab=5,pc-,pc=6,ot=7")
    Assertions.assertEquals(11, actualDemo.size)
    Assertions.assertEquals("rn=1", actualDemo[0])
    Assertions.assertEquals("cm-", actualDemo[1])
  }
}