package cl.ravenhill.pijamaparty.bequickorbedead;// Java program for implementation of QuickSort

class QuickSorter<T extends Comparable<T>> {
  public static void main(String[] args) {
    QuickSorter<String> sorter =
        new QuickSorter<>();
    String[] arr =
        new String[]{"De", "Pana", "Banana",
                     "Iguana", "Con", "Katana",
                     "Comiendo", "Manzana"};
    sorter.sort(arr, 0, arr.length - 1);

    for (String s : arr) {
      System.out.print(s + " ");
    }
  }

  public int partition(T[] arr, int low,
                       int high) {
    T pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j <= high - 1; j++) {
      if (arr[j].compareTo(pivot) <= 0) {
        i++;
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    T temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  public void sort(T[] arr, int l, int h) {
    int[] stack = new int[h - l + 1];
    int top = -1;
    stack[++top] = l;
    stack[++top] = h;
    while (top >= 0) {
      h = stack[top--];
      l = stack[top--];
      int p = partition(arr, l, h);
      if (p - 1 > l) {
        stack[++top] = l;
        stack[++top] = p - 1;
      }
      if (p + 1 < h) {
        stack[++top] = p + 1;
        stack[++top] = h;
      }
    }
  }
} 