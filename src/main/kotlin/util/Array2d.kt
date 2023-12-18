package util

class Array2d<T>(
    private val rowSize: Int,
    private val columnSize: Int,
    defaultValue: T
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

    fun add(rowIdx: Int, columnIdx: Int, value: T) {
        if ((rowIdx in 0..<rowSize) && (columnIdx in 0..<columnSize))
            array2d[rowIdx]!![columnIdx] = value
        else
            throw IllegalArgumentException("Arguments are wrong")
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
}