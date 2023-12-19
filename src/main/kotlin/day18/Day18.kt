package day18

import base.Day

class Day18(dayNumber: Int, loadDemoData: Boolean, postFix: String = "") : Day(dayNumber, loadDemoData, postFix) {
    // <Zeile-Y, [MinX, MaxX]> => Distanz = Abs(MinX) + Abs(MaxX)
    private val lagoonPlan: MutableMap<Int, MutableSet<Int>> = mutableMapOf()
    fun parseCubeInfo(cmd: String): LagoonCubes {
        val cmdParts = cmd.split(" ")
        return LagoonCubes(
            cmdParts[0],
            cmdParts[1].toInt(),
            cmdParts[2].substring(1, cmdParts[2].length - 1)
        )
    }

    fun digger(diggerPoint: DiggerPoint, lagoonCubes: LagoonCubes): DiggerPoint {
        when (lagoonCubes.direction) {
            "R" -> {
                diggerPoint.column += lagoonCubes.hub
                val lineInfo = lagoonPlan[diggerPoint.row]
                if (lineInfo != null) {
                    lineInfo.add(diggerPoint.column)
                } else {
                    lagoonPlan[diggerPoint.row] = mutableSetOf(diggerPoint.column)
                }
            }

            "L" -> {
                diggerPoint.column -= lagoonCubes.hub
                val lineInfo = lagoonPlan[diggerPoint.row]
                if (lineInfo != null) {
                    lineInfo.add(diggerPoint.column)
                } else {
                    lagoonPlan[diggerPoint.row] = mutableSetOf(diggerPoint.column)
                }
            }

            "U" -> {
                for (rowIdx in 1..lagoonCubes.hub) {
                    val lineIdx = diggerPoint.row - rowIdx
                    val lineInfo = lagoonPlan[lineIdx]
                    if (lineInfo != null) {
                        lineInfo.add(diggerPoint.column)
                    } else {
                        lagoonPlan[lineIdx] = mutableSetOf(diggerPoint.column)
                    }
                }
                diggerPoint.row -= lagoonCubes.hub
            }

            "D" -> {
                for (rowIdx in 1..lagoonCubes.hub) {
                    val lineIdx = diggerPoint.row + rowIdx
                    val lineInfo = lagoonPlan[lineIdx]
                    if (lineInfo != null) {
                        lineInfo.add(diggerPoint.column)
                    } else {
                        lagoonPlan[lineIdx] = mutableSetOf(diggerPoint.column)
                    }
                }
                diggerPoint.row += lagoonCubes.hub
            }
        }

        return diggerPoint
    }

    fun getLagoonPlan() = lagoonPlan

//  private fun digger(startPoint: Pair<Int, Int>, lagoonCubes: LagoonCubes, lagoon: Array2d<Char>): Pair<Int, Int> {
//    return when (lagoonCubes.direction) {
//      "R" -> Pair(startPoint.first, startPoint.second + lagoonCubes.hub)
//      "L" -> Pair(startPoint.first, startPoint.second - lagoonCubes.hub)
//      "U" -> Pair(startPoint.first - lagoonCubes.hub, startPoint.second)
//      "D" -> Pair(startPoint.first + lagoonCubes.hub, startPoint.second)
//      else -> {
//        throw IllegalArgumentException("Direction (${lagoonCubes.direction}) not found!")
//      }
//    }
//  }

    private fun diggerLagoon(diggerPoint: DiggerPoint) {
        var nextDiggerPoint = diggerPoint
        storeData.forEach { line ->
            val lagoonCubes = parseCubeInfo(line)
            nextDiggerPoint = digger(nextDiggerPoint, lagoonCubes)
        }
    }

    /**
     * Berechnung der ersten Teilaufgabe
     * @returns {Int}
     * @override
     */
    override fun calcPartOne(): Int {
        // Init digger start
        val diggerPoint = DiggerPoint(0, 0)
        lagoonPlan[diggerPoint.row] = mutableSetOf(0)

        diggerLagoon(diggerPoint)
        println("$diggerPoint $lagoonPlan")
        var result = 0
        lagoonPlan.forEach { line ->
            val sortedList = line.value.sorted()
            result += if (sortedList.size % 2 == 0) {
                sortedList.last() - sortedList.first() + 2
            } else {
                sortedList.last() - sortedList.first() + 1
            }
        }
        return result
    }

    /**
     * Berechnung der zweiten Teilaufgabe
     * @returns {Int}
     * @override
     */
    override fun calcPartTwo(): Int {
        return 0
    }
}

data class LagoonCubes(val direction: String, val hub: Int, val rgb: String)
data class DiggerPoint(var row: Int, var column: Int)