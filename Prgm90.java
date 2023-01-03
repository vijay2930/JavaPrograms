// Java Program to sort the words in ascending.

import java.util.*;

public class Prgm90 {
  public static void main(String[] args) {
    String sentence = "This is a sample sentence.";

    String[] words = sentenceToWordArray(sentence);
    Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

    for (String word : words) {
      System.out.println(word);
    }
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

