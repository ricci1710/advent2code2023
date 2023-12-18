package util

import kotlin.math.abs

class Util {
    companion object {
        fun permuteStrings(arr: Array<String>): List<List<String>> {
            val result = mutableListOf<List<String>>()
            permute(arr, 0, result)
            return result
        }

        private fun permute(arr: Array<String>, index: Int, result: MutableList<List<String>>) {
            if (index == arr.size) {
                result.add(arr.toList())
            } else {
                for (i in index until arr.size) {
                    // Swap the characters at positions index and i
                    arr[index] = arr[i].also { arr[i] = arr[index] }
                    permute(arr, index + 1, result)
                    // Swap them back to backtrack and try the next possibility
                    arr[index] = arr[i].also { arr[i] = arr[index] }
                }
            }
        }

        fun isOdd(number: Int): Boolean = number % 2 != 0
        fun isEven(number: Int): Boolean = number % 2 == 0

        private fun manhattanDistanz(point1: Pair<Int, Int>, point2: Pair<Int, Int>): Int {
            return abs(point1.first - point2.first) + abs(point1.second - point2.second)
        }

        /**
         * Pathfinding A* search algorithm
         */
        fun aStarSearch(start: Node, goal: Node, grid: Array<Array<Int>>): List<Node> {
            val openSet = mutableListOf<Node>()
            val closedSet = mutableListOf<Node>()

            openSet.add(start)

            while (openSet.isNotEmpty()) {
                val current = openSet.minByOrNull { it.cost + it.heuristic } ?: break

                if (current == goal) {
                    val path = mutableListOf<Node>()
                    var temp: Node? = current
                    while (temp != null) {
                        path.add(temp)
                        temp = temp.parent
                    }
                    return path.reversed()
                }

                openSet.remove(current)
                closedSet.add(current)

                val neighbors = mutableListOf<Node>()
                // Add neighboring nodes to the list

                // Example: Assuming movements allowed are up, down, left, right (no diagonal movement)
                val dx = intArrayOf(0, 0, -1, 1)
                val dy = intArrayOf(-1, 1, 0, 0)

                for (i in 0 until 4) {
                    val newX = current.x + dx[i]
                    val newY = current.y + dy[i]

                    if (newX >= 0 && newX < grid.size && newY >= 0 && newY < grid[0].size && grid[newX][newY] == 0) {
                        val neighbor = Node(newX, newY, current)
                        neighbors.add(neighbor)
                    }
                }

                for (neighbor in neighbors) {
                    if (neighbor in closedSet) {
                        continue
                    }

                    val tempCost = current.cost + 1 // Assuming uniform cost for each step
                    if (tempCost < neighbor.cost || neighbor !in openSet) {
                        neighbor.cost = tempCost
                        // calculate heuristic value, e.g., Manhattan distance to goal
                        neighbor.heuristic = manhattanDistanz(
                            Pair(neighbor.x, neighbor.y),
                            Pair(current.x, current.y)
                        )

                        if (neighbor !in openSet) {
                            openSet.add(neighbor)
                        }
                    }
                }
            }

            return emptyList()
        }
    }
}

data class Node(
    val x: Int,
    val y: Int,
    var parent: Node?,
    var cost: Int = 0,
    var heuristic: Int = 0
)