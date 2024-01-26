package day05

import base.Day

class Day05(dayNumber: Int, loadDemoData: Boolean) : Day(dayNumber, loadDemoData) {
  private val seeds = mutableListOf<Long>()
  private val seedToSoilMap = mutableMapOf<util.LongRange, util.LongRange>()
  private val soilToFertilizerMap = mutableMapOf<util.LongRange, util.LongRange>()
  private val fertilizerToWaterMap = mutableMapOf<util.LongRange, util.LongRange>()
  private val waterToLightMap = mutableMapOf<util.LongRange, util.LongRange>()
  private val lightToTemperatureMap = mutableMapOf<util.LongRange, util.LongRange>()
  private val temperatureToHumidityMap = mutableMapOf<util.LongRange, util.LongRange>()
  private val humidityToLocationMap = mutableMapOf<util.LongRange, util.LongRange>()

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
    for (idx in 1..<seedLine.size)
      seeds.add(seedLine[idx].toLong())
  }

  /**
   * Each line within a map contains three numbers: the destination range start, the source range start, and the range length.
   */
  private fun readMapEntries(rangeMap: MutableMap<util.LongRange, util.LongRange>, line: String) {
    val rangeInfos = line.split(" ").map { it.toLong() }

    val rangeDistance = rangeInfos[2]
    val sourceRange = util.LongRange(rangeInfos[1], rangeInfos[1] + rangeDistance - 1)
    val targetRange = util.LongRange(rangeInfos[0], rangeInfos[0] + rangeDistance - 1)

    rangeMap[sourceRange] = targetRange
  }

  private fun initRangeMaps() {
    var mapName = "seeds"
    storeData.forEach { line ->
      if (line.isEmpty())
        mapName = stackName.removeFirst()
      else if (mapName == "seeds")
        readSeeds(line)
      else if (line.indexOf(mapName) < 0) {
        when (mapName) {
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
  }
  // endregion region file scan

  private fun getMapValue(searchValue: Long, converterMap: Map<util.LongRange, util.LongRange>): Long {
    var res = searchValue
    for ((key, value) in converterMap) {
      if ((key.first..key.last).contains(searchValue)) {
        res = value.first + key.indexOf(searchValue)
        break
      }
    }

    return res
  }

  /**
   * Berechnung der ersten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartOne(): Long {
    var result = Long.MAX_VALUE
    seeds.forEach { seed ->
      var value = getMapValue(seed, seedToSoilMap)
      value = getMapValue(value, soilToFertilizerMap)
      value = getMapValue(value, fertilizerToWaterMap)
      value = getMapValue(value, waterToLightMap)
      value = getMapValue(value, lightToTemperatureMap)
      value = getMapValue(value, temperatureToHumidityMap)
      value = getMapValue(value, humidityToLocationMap)

      result = result.coerceAtMost(value)
    }
    return result
  }

  /**
   * Berechnung der zweiten Teilaufgabe
   * @returns {Long}
   * @override
   */
  override fun calcPartTwo(): Long {
    var result = Long.MAX_VALUE

    val seedRange = mutableListOf<util.LongRange>()
    for (idx in 0..<seeds.size step 2) {
      val seed = seeds[idx]
      seedRange.add(util.LongRange(seed, seed + seeds[idx + 1] - 1))
    }

    seedRange.forEach { seedRangeItem ->
      for (idx in seedRangeItem.first..seedRangeItem.last) {
        var value = getMapValue(idx, seedToSoilMap)
        value = getMapValue(value, soilToFertilizerMap)
        value = getMapValue(value, fertilizerToWaterMap)
        value = getMapValue(value, waterToLightMap)
        value = getMapValue(value, lightToTemperatureMap)
        value = getMapValue(value, temperatureToHumidityMap)
        value = getMapValue(value, humidityToLocationMap)

        result = result.coerceAtMost(value)
      }
    }

    return result
  }
}
