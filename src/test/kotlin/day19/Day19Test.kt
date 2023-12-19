package day19

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day19Test {
    private val demoDay = Day19(19, true)
    private val lifeDay = Day19(19, false)

    @Test
    fun `calculate solution for demo data part one`() {
        val expectedDemo = 19114
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
    fun `add part rating from input data 1`() {
        val actualDemo = demoDay.addPartRating("{x=8,m=2267,a=3,s=2530}}")
        Assertions.assertEquals(actualDemo.x, 8)
        Assertions.assertEquals(actualDemo.m, 2267)
        Assertions.assertEquals(actualDemo.a, 3)
        Assertions.assertEquals(actualDemo.s, 2530)
    }

    @Test
    fun `add part rating from input data 2`() {
        val actualDemo = demoDay.addPartRating("{x=787,m=2655,a=1222,s=2876}")
        Assertions.assertEquals(actualDemo.x, 787)
        Assertions.assertEquals(actualDemo.m, 2655)
        Assertions.assertEquals(actualDemo.a, 1222)
        Assertions.assertEquals(actualDemo.s, 2876)
    }

    @Test
    fun `add workflow from input data px`() {
        val actualDemo = demoDay.addWorkflow("px{a<2006:qkq,m>2090:A,rfg}")
        val instruction0 = actualDemo.instruction0
        val instruction1 = actualDemo.instruction1
        val instruction2 = actualDemo.instruction2
        val instruction3 = actualDemo.instruction3

        Assertions.assertEquals(actualDemo.instruction1, 787)
        Assertions.assertEquals(actualDemo.instruction1, 787)
        Assertions.assertEquals(actualDemo.instruction1, 787)
        Assertions.assertEquals(actualDemo.instruction1, 787)
    }

    @Test
    fun `add workflow from input data pv`() {
        val actualDemo = demoDay.addWorkflow("pv{a>1716:R,A}")
        val instruction1 = actualDemo.instruction1
        Assertions.assertEquals(actualDemo.instruction1, 787)
    }

    @Test
    fun `add workflow from input data in`() {
        val actualDemo = demoDay.addWorkflow("in{s<1351:px,qqz}")
        val instruction1 = actualDemo.instruction1
        Assertions.assertEquals(actualDemo.instruction1, 787)
    }

}