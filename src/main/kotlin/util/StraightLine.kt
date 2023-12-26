package util


/**
 * f(x) = y = m*x + b
 */
class StraightLine {
  var m: Double
  var b: Double

  constructor(m: Double, b: Double) {
    this.m = m
    this.b = b
  }

  constructor(p1: java.awt.Point, p2: java.awt.Point) {
    val pp1 = Point(p1.x.toDouble(), p1.y.toDouble())
    val pp2 = Point(p2.x.toDouble(), p2.y.toDouble())

    this.m = getGradient(pp1, pp2)
    this.b = getB(pp1, m)
  }

  constructor(p1: Point, p2: Point) {
    this.m = getGradient(p1, p2)
    this.b = getB(p1, m)
  }

  override fun toString(): String {
    return "f(x) = $m * x + $b"
  }

  /**
   * Bestimme zunächst die Steigung m = Δy / Δx
   */
  fun getGradient(p1: Point, p2: Point): Double {
    return (p2.y - p1.y) / (p2.x - p1.x)
  }

  fun getB(p: Point, m: Double): Double {
    return p.y - m * p.x
  }

  private fun f(x: Double): Double {
    return x * m + b
  }

  /**
   * m1 * x + b1 = m2 * x + b2   | -b2
   * m1 * x + b1 -b2 = m2*x      | - m1 * x
   * b1-b2 = (m2-m1)x            |  :(m2-m1)
   * x = (b1-b2)/(m2-m1)
   */
  fun intersection(gx: StraightLine): Point {
    val x: Double = (b - gx.b) / (gx.m - m)
    val y: Double = f(x)
    return Point(x, y)
  }

  data class Point(var x: Double, var y: Double) {}
}

