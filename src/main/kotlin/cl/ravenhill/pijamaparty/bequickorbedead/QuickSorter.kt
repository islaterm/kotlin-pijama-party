package cl.ravenhill.pijamaparty.bequickorbedead

inline fun <reified T : Comparable<T>> partition(arr: Array<T>, low: Int, high: Int): Int {
  val pivot = arr[high]
  var i = low - 1
  for (j in low until high) {
    if (arr[j] <= pivot) {
      i++
      val temp = arr[i]
      arr[i] = arr[j]
      arr[j] = temp
    }
  }
  val temp = arr[i + 1]
  arr[i + 1] = arr[high]
  arr[high] = temp
  return i + 1
}

inline fun <reified T : Comparable<T>> quickSort(arr: Array<T>, l: Int, h: Int) {
  val stack = IntArray(h - l + 1)
  var top = -1
  stack[++top] = l
  stack[++top] = h
  while (top >= 0) {
    val hi = stack[top--]
    val lo = stack[top--]
    val p = partition(arr, lo, hi)
    if (p - 1 > lo) {
      stack[++top] = lo
      stack[++top] = p - 1
    }
    if (p + 1 < hi) {
      stack[++top] = p + 1
      stack[++top] = hi
    }
  }
}

fun main() {
  val arr = arrayOf("De", "Pana", "Banana", "Iguana", "Con", "Katana", "Comiendo", "Manzana")
  quickSort(arr, 0, arr.size - 1)
  for (s in arr) {
    print("$s ")
  }
}