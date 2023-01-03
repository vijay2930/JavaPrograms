// Java program to find a character in a word string linear search.

import java.util.Scanner;
public class Prgm96 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String:");
    String s=sc.nextLine();
    System.out.print("Enter the Character:");
    char c=sc.next().charAt(0);
    System.out.println(linearSearch(s,c));
  }

  public static int linearSearch(String word, char c) {
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == c) {
        return i;
      }
    }
    return -1;
  }
}
