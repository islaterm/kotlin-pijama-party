package cl.ravenhill.pijamaparty.okpal

fun main() {
  println(isPalindrome("OK Pal"))
  println(
    isPalindrome(
      "Are we not pure? " +
          "“No, sir!” " +
          "Panama’s moody Noriega brags. " +
          "“It is garbage!” " +
          "Irony dooms a man—a prisoner up to new era."
    )
  )
}

fun isPalindrome(word: String): Boolean {
  val cleanWord = word.replace("[^a-zA-Z0-9]".toRegex(), "").toLowerCase()
  val len = cleanWord.length
  for ((i, c) in cleanWord.withIndex()) {
    if (i < len / 2 && c != cleanWord[len - 1 - i]) {
      return false
    }
  }
  return true
}