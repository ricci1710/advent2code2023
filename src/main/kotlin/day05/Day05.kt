package day05

import base.Day

class Day05(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private val seeds = mutableListOf<Long>()
  private val seedToSoilMap = mutableMapOf<LongRange, LongRange>()
  private val soilToFertilizerMap = mutableMapOf<LongRange, LongRange>()
  private val fertilizerToWaterMap = mutableMapOf<LongRange, LongRange>()
  private val waterToLightMap = mutableMapOf<LongRange, LongRange>()
  private val lightToTemperatureMap = mutableMapOf<LongRange, LongRange>()
  private val temperatureToHumidityMap = mutableMapOf<LongRange, LongRange>()
  private val humidityToLocationMap = mutableMapOf<LongRange, LongRange>()

  private val stackName = ArrayDeque(
    listOf(
      "seed-to-soil",
      "soil-to-fertilizer",
      "fertilizer-to-water",
      "water-to-light",
      "light-to-temperature",
      "temperature-to-humidity",
      "humidity-to-location",
    )
  )

  init {
    initRangeMaps()
  }

  // region file scan
  private fun readSeeds(line: String) {
    val seedLine = line.split(" ")
    for (idx in 1..seeds.size)
      seeds.add(seedLine[idx].toLong())
  }

  /**
   * Each line within a map contains three numbers: the destination range start, the source range start, and the range length.
   */
  private fun readMapEntries(rangeMap: MutableMap<LongRange, LongRange>, line: String) {
    val rangeInfos = line.split(" ").map { it.toLong() }

    val rangeDistance = rangeInfos[2]
    val sourceRange = LongRange(rangeInfos[1], rangeInfos[1] + rangeDistance - 1)
    val targetRange = LongRange(rangeInfos[0], rangeInfos[0] + rangeDistance - 1)

    rangeMap[sourceRange] = targetRange
  }

  private fun initRangeMaps() {
    var mapName = "seeds"
    storeData.forEach { line ->
      if (line.isEmpty())
        mapName = stackName.removeFirst()
      else if (line.indexOf(mapName) < 0) {
        when (mapName) {
          "seeds" -> readSeeds(line)
          "seed-to-soil" -> readMapEntries(seedToSoilMap, line)
          "soil-to-fertilizer" -> readMapEntries(soilToFertilizerMap, line)
          "fertilizer-to-water" -> readMapEntries(fertilizerToWaterMap, line)
          "water-to-light" -> readMapEntries(waterToLightMap, line)
          "light-to-temperature" -> readMapEntries(lightToTemperatureMap, line)
          "temperature-to-humidity" -> readMapEntries(temperatureToHumidityMap, line)
          "humidity-to-location" -> readMapEntries(humidityToLocationMap, line)
        }
      }
    }

    println(seedToSoilMap)
  }
  // endregion region file scan

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    var result = Long.MAX_VALUE
    seeds.forEach { seed ->
      println(seed)
    }
    return result
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartTwo(): Long {
    return 0L
  }
}
