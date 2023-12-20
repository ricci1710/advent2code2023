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

        var workflowKey = instruction0!!.workflowKey
        var condition = instruction0.condition
        Assertions.assertEquals("a", condition!!.field)
        Assertions.assertEquals("<", condition.operator)
        Assertions.assertEquals(2006, condition.value)
        Assertions.assertEquals("qkq", workflowKey)

        workflowKey = instruction1!!.workflowKey
        condition = instruction1.condition
        Assertions.assertEquals("m", condition!!.field)
        Assertions.assertEquals(">", condition.operator)
        Assertions.assertEquals(2090, condition.value)
        Assertions.assertEquals("A", workflowKey)

        workflowKey = instruction2!!.workflowKey
        condition = instruction2.condition
        Assertions.assertNull(condition)
        Assertions.assertEquals("rfg", workflowKey)

        Assertions.assertNull(instruction3)
    }

    @Test
    fun `add workflow from input data in`() {
        val actualDemo = demoDay.addWorkflow("in{s<1351:px,qqz}")
        val instruction0 = actualDemo.instruction0
        val instruction1 = actualDemo.instruction1
        val instruction2 = actualDemo.instruction2
        val instruction3 = actualDemo.instruction3

        var workflowKey = instruction0!!.workflowKey
        var condition = instruction0.condition
        Assertions.assertEquals("s", condition!!.field)
        Assertions.assertEquals("<", condition.operator)
        Assertions.assertEquals(1351, condition.value)
        Assertions.assertEquals("px", workflowKey)

        workflowKey = instruction1!!.workflowKey
        condition = instruction1.condition
        Assertions.assertNull(condition)
        Assertions.assertEquals("qqz", workflowKey)

        Assertions.assertNull(instruction2)
        Assertions.assertNull(instruction3)
    }

    @Test
    fun `add workflow from input data ex`() {
        val actualDemo = demoDay.addWorkflow("ex{x>10:eins,m<20:zwei,a>30:R,A}")
        val instruction0 = actualDemo.instruction0
        val instruction1 = actualDemo.instruction1
        val instruction2 = actualDemo.instruction2
        val instruction3 = actualDemo.instruction3

        var workflowKey = instruction0!!.workflowKey
        var condition = instruction0.condition
        Assertions.assertEquals("x", condition!!.field)
        Assertions.assertEquals(">", condition.operator)
        Assertions.assertEquals(10, condition.value)
        Assertions.assertEquals("eins", workflowKey)

        workflowKey = instruction1!!.workflowKey
        condition = instruction1.condition
        Assertions.assertEquals("m", condition!!.field)
        Assertions.assertEquals("<", condition.operator)
        Assertions.assertEquals(20, condition.value)
        Assertions.assertEquals("zwei", workflowKey)

        workflowKey = instruction2!!.workflowKey
        condition = instruction2.condition
        Assertions.assertEquals("a", condition!!.field)
        Assertions.assertEquals(">", condition.operator)
        Assertions.assertEquals(30, condition.value)
        Assertions.assertEquals("R", workflowKey)

        workflowKey = instruction3!!.workflowKey
        condition = instruction3.condition
        Assertions.assertNull(condition)
        Assertions.assertEquals("A", workflowKey)
    }

    @Test
    fun `create instruction from string with condition`() {
        val actualDemo = demoDay.createInstruction("s<1351:px")
        val condition = actualDemo.condition
        Assertions.assertNotNull(condition)
        Assertions.assertEquals("s", condition!!.field)
        Assertions.assertEquals("<", condition.operator)
        Assertions.assertEquals(1351, condition.value)
        Assertions.assertEquals("px", actualDemo.workflowKey)
    }

    @Test
    fun `create instruction from string without condition`() {
        var actualDemo = demoDay.createInstruction("A")
        var condition = actualDemo.condition
        Assertions.assertNull(condition)
        Assertions.assertEquals("A", actualDemo.workflowKey)

        actualDemo = demoDay.createInstruction("R")
        condition = actualDemo.condition
        Assertions.assertNull(condition)
        Assertions.assertEquals("R", actualDemo.workflowKey)

        actualDemo = demoDay.createInstruction("lnx")
        condition = actualDemo.condition
        Assertions.assertNull(condition)
        Assertions.assertEquals("lnx", actualDemo.workflowKey)
    }
}