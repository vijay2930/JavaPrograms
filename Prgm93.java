// Java Program to sort the characters in a word in descending using recursion

public class Prgm93 {
  public static void main(String[] args) {
    String word = "Hello";

    char[] chars = word.toCharArray();
    sort(chars, 0, chars.length - 1);

    for (char c : chars) {
      System.out.println(c);
    }
  }

  public static void sort(char[] array, int start, int end) {
    if (start < end) {

      int pivotIndex = partition(array, start, end);

      sort(array, start, pivotIndex - 1);
      sort(array, pivotIndex + 1, end);
    }
  }

  public static int partition(char[] array, int start, int end) {
    char pivot = array[end];

    int pivotIndex = start;

    for (int i = start; i < end; i++) {
      if (array[i] > pivot) {
        char temp = array[pivotIndex];
        array[pivotIndex] = array[i];
        array[i] = temp;
        pivotIndex++;
      }
    }

    char temp = array[pivotIndex];
    array[pivotIndex] = pivot;
    array[end] = temp;

    return pivotIndex;
  }
}

