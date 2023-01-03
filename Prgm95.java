// Java Program to find the given two strings are palindrome.

import java.util.Scanner;
public class Prgm95 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String 1:");
    String s1=sc.nextLine();
    System.out.print("Enter the String 2:");
    String s2=sc.nextLine();
    System.out.println(isPalindrome(s1,s2)); 
  }
  public static boolean isPalindrome(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
