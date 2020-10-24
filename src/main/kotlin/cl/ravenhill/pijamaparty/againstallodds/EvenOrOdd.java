package cl.ravenhill.pijamaparty.againstallodds;

public class EvenOrOdd {
  public static void main(String[] args) {
    EvenOrOdd evenOrOdd = new EvenOrOdd();
    System.out.println(evenOrOdd.isEven(2));
    System.out.println(evenOrOdd.isOdd(1));
    System.out.println(evenOrOdd.isEven(1));
  }

  public boolean isEven(int n) {
    return n >= 0 && (n == 0 || isOdd(n - 1));
  }

  public boolean isOdd(int n) {
    return n > 0 && isEven(n - 1);
  }
}
