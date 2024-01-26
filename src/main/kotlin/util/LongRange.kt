package util

class LongRange(
  var first: Long,
  var last: Long
) {
  fun contain(value: Long): Boolean {
    return value in first..last
  }

  fun indexOf(value: Long): Long {
    return value - first
  }
}