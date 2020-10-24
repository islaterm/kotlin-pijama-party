package cl.ravenhill.pijamaparty.againstallodds

fun main() {
  println(isEven(2))
  println(isOdd(5))
  println(isEven(7))
}

fun isEven(n: Int) = n >= 0 && (n == 0 || isOdd(n - 1))

fun isOdd(n: Int): Boolean = n > 0 && isEven(n - 1)
