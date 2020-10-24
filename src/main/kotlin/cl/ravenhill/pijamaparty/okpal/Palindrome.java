package cl.ravenhill.pijamaparty.okpal;

public class Palindrome {

  public static void main(String[] args) {
    Palindrome p = new Palindrome();
    System.out.println(p.isPalindrome("OK Pal"));
    System.out.println(p.isPalindrome(
        "Are we not pure? "
        + "“No, sir!” Panama’s moody Noriega brags. "
        + "“It is garbage!” "
        + "Irony dooms a man—a prisoner up to new era."));
  }

  public boolean isPalindrome(String word) {
    word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int len = word.length();
    for (int c = 0; c < len / 2; c++) {
      if (word.charAt(c) != word.charAt(len - 1 - c)) {
        return false;
      }
    }
    return true;
  }
}
