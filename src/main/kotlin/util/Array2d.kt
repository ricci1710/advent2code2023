package util

class Array2d(row: Int, column: Int) {
  private val array2d: Array<IntArray> = Array(row) { IntArray(column) }
  fun toPrint(): String {
    return array2d.toString()
  }

  fun get(row:Int, column: Int): Int {
    return array2d[row][column]
  }

  fun rowSize() = array2d.size
  fun columnSize() = if (array2d.isNotEmpty()) array2d[0].size else 0

  fun fillSpiralPattern() {
    if (rowSize() != columnSize())
      throw Error("Pattern ar not available!")

    val startPoint = rowSize() / 2

    array2d[startPoint][startPoint] = 1
    array2d[startPoint][startPoint + 1] = 2
  }
}