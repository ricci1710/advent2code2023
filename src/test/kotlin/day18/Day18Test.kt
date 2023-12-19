package day18

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day18Test {
    private val demoDay = Day18(18, true)
    private val lifeDay = Day18(18, false)

    @Test
    fun `calculate solution for demo data part one`() {
        val expectedDemo = 68
        val actualDemo = demoDay.calcPartOne()
        Assertions.assertEquals(expectedDemo, actualDemo)
    }

    @Test
    fun `calculate solution for life data part one`() {
        // Life-Data
        val expectedLife = 70158 // 70157 to high
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
    fun parseCubeInfo() {
        val actualDemo = demoDay.parseCubeInfo("D 12 (#219443)")
        Assertions.assertEquals("D", actualDemo.direction)
        Assertions.assertEquals(12, actualDemo.hub)
        Assertions.assertEquals("#219443", actualDemo.rgb)
    }

    @Test
    fun `digger on command line`() {
        val diggerPoint = DiggerPoint(0, 0)
        val nextDiggerPoint = demoDay.digger(diggerPoint, LagoonCubes("R", 5, "#219443"))
        Assertions.assertEquals(0, nextDiggerPoint.row)
        Assertions.assertEquals(5, nextDiggerPoint.column)

        val lagoonPlan = demoDay.getLagoonPlan()
        Assertions.assertEquals(1, lagoonPlan[0]!!.size)
    }

    /**
     * ###.###
     * #.###.#
     * #.....#
     * ##..###
     * .#..#..
     * .#..###
     * .#....#
     * .######
     */
    @Test
    fun `test with own better datas`() {
        val expectedDemo = 49
        val demoDay = Day18(18, true, "a")
        val actualDemo = demoDay.calcPartOne()
        Assertions.assertEquals(expectedDemo, actualDemo)
    }
}