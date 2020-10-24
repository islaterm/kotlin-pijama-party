package cl.ravenhill.pijamaparty.stinginthetail;

public class Fibonacci {
  public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();
    fib.printSequence(9);
  }

  public void printSequence(int n) {
    printSequenceAux(n, 0, 1);
  }

  public void printSequenceAux(int n, int a, int b) {
    System.out.println(a);
    if (n > 0) {
      // Tail recursion :0!
      printSequenceAux(n - 1, b, a + b);
    }
  }
}
