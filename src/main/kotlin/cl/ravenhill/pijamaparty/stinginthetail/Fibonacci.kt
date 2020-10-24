package cl.ravenhill.pijamaparty.stinginthetail

fun main() {
  printFibonacci(9)
}

fun printFibonacci(n: Int) {
  fibAux(n, 0, 1)
}

tailrec fun fibAux(n: Int, a: Int, b: Int) {
  println(a)
  if (n > 0) {
    fibAux(n - 1, b, a + b)
  }
}
