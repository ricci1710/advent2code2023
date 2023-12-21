package util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Array2dTest {
  private lateinit var grid: Array2d<Char>

  @BeforeEach
  fun setUp() {
    grid = Array2d(5, 5, '.', true)
  }

  @Test
  fun `add and get a char in cell`() {
    grid.add(2, 3, '#')
    var result = grid.get(2, 3)
    Assertions.assertEquals('#', result)

    result = grid.get(3, 2)
    Assertions.assertEquals('.', result)
  }

  @Test
  fun `add a new column to the existent grid`() {
    Assertions.assertEquals(5, grid.rowSize)
    Assertions.assertEquals(5, grid.columnSize)

    grid.addEmptyColumn()

    Assertions.assertEquals(5, grid.rowSize)
    Assertions.assertEquals(6, grid.columnSize)

    grid.add(0, 5, '#')

    val result = grid.get(0, 5)
    Assertions.assertEquals('#', result)
  }

  @Test
  fun `add a new row to the existent grid`() {
    Assertions.assertEquals(5, grid.rowSize)
    Assertions.assertEquals(5, grid.columnSize)

    grid.addEmptyRow()

    Assertions.assertEquals(6, grid.rowSize)
    Assertions.assertEquals(5, grid.columnSize)

    grid.add(5, 0, '#')

    val result = grid.get(5, 0)
    Assertions.assertEquals('#', result)
  }
}