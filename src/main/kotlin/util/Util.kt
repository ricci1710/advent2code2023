package util

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
  }
}