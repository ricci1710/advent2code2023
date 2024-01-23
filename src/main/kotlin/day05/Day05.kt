package day05

import base.Day

class Day05(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
    private val seeds = mutableListOf<Int>()
    private val seedToSoilMap = mutableListOf<IntRange>()
    private val soilToFertilizerMap = mutableListOf<IntRange>()
    private val fertilizerToWaterMap = mutableListOf<IntRange>()
    private val waterToLightMap = mutableListOf<IntRange>()
    private val lightToTemperatureMap = mutableListOf<IntRange>()
    private val temperatureToHumidityMap = mutableListOf<IntRange>()
    private val humidityToLocationMap = mutableListOf<IntRange>()

    private fun readSeeds(line: String) {

    }

    private fun readMapEntries(intRangeMap: MutableList<IntRange>, line: String) {

    }

    fun initRangeMaps() {
        storeData.forEach {
            readSeeds("")

        }

    }

    /**
     * Berechnung der ersten Teilaufgabe
     * @returns {Int}
     * @override
     */
    override fun calcPartOne(): Int {
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
