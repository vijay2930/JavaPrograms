// Java Program to sort the characters in a word in descending.
import java.util.Arrays;

public class Prgm91 {
  public static void main(String[] args) {
    String word = "Hello";

    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    reverse(chars);

    for (char c : chars) {
      System.out.println(c);
    }
  }

  public static void reverse(char[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      char temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
  }
}
