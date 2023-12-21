package util

class Array2d<T>(
  var rowSize: Int,
  var columnSize: Int,
  private val defaultValue: T,
  private val growUp: Boolean = false
) {
  private val array2d: MutableMap<Int, MutableList<T>> = mutableMapOf()

  init {
    for (rowIdx in 0..<rowSize) {
      array2d[rowIdx] = mutableListOf()
      for (columnIdx in 0..<columnSize) {
        array2d[rowIdx]!!.add(columnIdx, defaultValue)
      }
    }
  }

  fun add(point: Pair<Int, Int>, value: T) {
    add(point.first, point.second, value)
  }

  fun add(rowIdx: Int, columnIdx: Int, value: T) {
    if ((rowIdx in 0..<rowSize) && (columnIdx in 0..<columnSize))
      array2d[rowIdx]!![columnIdx] = value
    else
      throw IllegalArgumentException("Arguments are wrong rowIdx: $rowIdx($rowSize) or columnIdx:$columnIdx($columnSize)")
  }

  fun get(rowIdx: Int, columnIdx: Int): T {
    if ((rowIdx in 0..<rowSize) && (columnIdx in 0..<columnSize))
      return array2d[rowIdx]!![columnIdx]
    else
      throw IllegalArgumentException("Arguments are wrong")
  }

  override fun toString(): String {
    var res = ""
    array2d.forEach { res = res + it.value.joinToString("") + "\n" }

    return res
  }

  fun addEmptyColumn() {
    for (rowIdx in 0..<rowSize) {
      array2d[rowIdx]!!.add(columnSize, defaultValue)
    }
    columnSize += 1
  }

  fun addEmptyRow() {
    array2d[rowSize] = mutableListOf()
    for (columnIdx in 0..<columnSize) {
      array2d[rowSize]!!.add(columnIdx, defaultValue)
    }

    rowSize += 1
  }

  fun addRowData(row: Int, valueList: List<T>) {
    var column = 0
    valueList.forEach { value ->
      add(row, column, value)
      column += 1
    }
  }
}