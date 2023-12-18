package day16

import base.Day
import util.Array2d

class Day16(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
    /**
     * Berechnung der ersten Teilaufgabe
     * @returns {Int}
     * @override
     */
    override fun calcPartOne(): Int {
        val opticalBoard = Array2d<Char>(storeData.size, storeData[0].length, '.')
        opticalBoard.add(4, 2, '#')
        println(opticalBoard.toString())
        return 0
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
