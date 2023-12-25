package util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.awt.Point

class StraightLineTest {
  @Test
  fun `test toString function with P1(19, 13)  P2(17,14)`() {
    val p1 = Point(19, 13)
    val p2 = Point(17, 14)

    val straightLine = StraightLine(p1, p2)
    val result = straightLine.toString()
    println(result)
    Assertions.assertEquals("f(x) = -0.5 * x + 22.5", result)
  }

  @Test
  fun `test toString function with P1(18,19)  P2(17,18)`() {
    val p1 = Point(18, 19)
    val p2 = Point(17, 18)

    val straightLine = StraightLine(p1, p2)
    val result = straightLine.toString()
    println(result)
    Assertions.assertEquals("f(x) = 1.0 * x + 1.0", result)
  }

  @Test
  fun `find the intersection from P1(19, 13)  P2(17,14) and P1(18,19)  P2(17,18)`() {
    val fx = StraightLine(Point(19, 13), Point(17, 14))
    val gx = StraightLine(Point(18, 19), Point(17, 18))

    val result = fx.intersection(gx)
    Assertions.assertEquals(14.333333333333334, result.x)
    Assertions.assertEquals(15.333333333333332, result.y)
  }

  @Test
  fun getGradient() {
    val fx = StraightLine(Point(0, 0), Point(0, 0))
    Assertions.assertEquals(-0.5, fx.getGradient(StraightLine.Point(19.0, 13.0), StraightLine.Point(17.0, 14.0)))
  }

  @Test
  fun getB() {
    val fx = StraightLine(Point(0, 0), Point(0, 0))
    val res = fx.getB(StraightLine.Point(19.0, 13.0), -0.5)
    Assertions.assertEquals(22.5, res)
  }
}