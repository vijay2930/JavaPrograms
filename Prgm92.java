// Java Program to sort the words in ascending using recursion.

import java.util.*;

public class Prgm92 {
  public static void main(String[] args) {
    String sentence = "This is a sample sentence.";

    String[] words = sentenceToWordArray(sentence);
    sort(words, 0, words.length - 1, String.CASE_INSENSITIVE_ORDER);

    for (String word : words) {
      System.out.println(word);
    }
  }

  public static void sort(String[] array, int start, int end, Comparator<String> comparator) {
    if (start < end) {
      int pivotIndex = partition(array, start, end, comparator);

      sort(array, start, pivotIndex - 1, comparator);
      sort(array, pivotIndex + 1, end, comparator);
    }
  }

  public static int partition(String[] array, int start, int end, Comparator<String> comparator) {
    String pivot = array[end];

    int pivotIndex = start;

    for (int i = start; i < end; i++) {
      if (comparator.compare(array[i], pivot) < 0) {
        String temp = array[pivotIndex];
        array[pivotIndex] = array[i];
        array[i] = temp;
        pivotIndex++;
      }
    }

    String temp = array[pivotIndex];
    array[pivotIndex] = pivot;
    array[end] = temp;

    return pivotIndex;
  }

  public static String[] sentenceToWordArray(String sentence) {
  List<String> words = new ArrayList<>();

  StringBuilder sb = new StringBuilder();

  for (int i = 0; i < sentence.length(); i++) {
    char c = sentence.charAt(i);
    if (c == ' ' || c == '.') {
      words.add(sb.toString());
      sb.setLength(0);
    } else {
      sb.append(c);
    }
  }

  words.add(sb.toString());

  return words.toArray(new String[0]);
}
}
