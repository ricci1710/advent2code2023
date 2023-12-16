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
        val expectedDemo = 145
        val actualDemo = demoDay.calcPartTwo()
        Assertions.assertEquals(expectedDemo, actualDemo)
    }

    @Test
    fun `calculate solution for life data part two`() {
        val expectedLife = 247153
        val actualLife = lifeDay.calcPartTwo()
        Assertions.assertEquals(expectedLife, actualLife)
    }

    @Test
    fun `test the holiday ASCII String Helper Algorithm`() {
        var actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("H")
        Assertions.assertEquals(200, actualDemo)

        actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("rn")
        Assertions.assertEquals(0, actualDemo)

        actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("qp")
        Assertions.assertEquals(1, actualDemo)

        actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("ot")
        Assertions.assertEquals(3, actualDemo)

        actualDemo = demoDay.holidayASCIIStringHelperAlgorithm("pc")
        Assertions.assertEquals(3, actualDemo)

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

    @Test
    fun `get the lens information from the sequence code`() {
        var actualDemo = demoDay.getLensInfo("rn=1")
        Assertions.assertEquals("rn", actualDemo.label)
        Assertions.assertEquals("=", actualDemo.operator)
        Assertions.assertEquals(1, actualDemo.lensFocus)

        actualDemo = demoDay.getLensInfo("cm-")
        Assertions.assertEquals("cm", actualDemo.label)
        Assertions.assertEquals("-", actualDemo.operator)
        Assertions.assertNull(actualDemo.lensFocus)
    }

    @Test
    fun `delete lens from box`() {
        val lensBoxes = mutableMapOf<Int, MutableMap<String, LensInfo>>()
        for (boxNo in 0..255)
            lensBoxes[boxNo] = mutableMapOf()

        var lensInfo = LensInfo("rn", "=", 1)
        demoDay.insertOrUpdateLensFromBox(0, lensInfo, lensBoxes)

        lensInfo = LensInfo("abc", "=", 4)
        demoDay.insertOrUpdateLensFromBox(0, lensInfo, lensBoxes)

        lensInfo = LensInfo("rn", "=", 9)
        demoDay.insertOrUpdateLensFromBox(0, lensInfo, lensBoxes)

        lensInfo = LensInfo("abc", "-")
        demoDay.deleteLensFromBox(0, lensInfo.label, lensBoxes)

        val lensBoxes0 = lensBoxes[0]!!
        Assertions.assertEquals(1, lensBoxes0.size)
    }

    @Test
    fun `insert or update lens from box`() {
        val lensBoxes = mutableMapOf<Int, MutableMap<String, LensInfo>>()
        for (boxNo in 0..255)
            lensBoxes[boxNo] = mutableMapOf()

        var lensInfo = LensInfo("rn", "=", 1)
        demoDay.insertOrUpdateLensFromBox(0, lensInfo, lensBoxes)

        lensInfo = LensInfo("abc", "=", 4)
        demoDay.insertOrUpdateLensFromBox(0, lensInfo, lensBoxes)

        lensInfo = LensInfo("rn", "=", 9)
        demoDay.insertOrUpdateLensFromBox(0, lensInfo, lensBoxes)

        val lensBoxes0 = lensBoxes[0]!!
        Assertions.assertEquals(2, lensBoxes0.size)
        Assertions.assertEquals(9, lensBoxes0["rn"]!!.lensFocus)
    }
}