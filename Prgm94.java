// Java Program to find the given two strings are anagram to each other

import java.util.Arrays;
import java.util.Scanner;
public class Prgm94 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String 1:");
    String s1=sc.nextLine();
    System.out.print("Enter the String 2:");
    String s2=sc.nextLine();
    System.out.println(isAnagram(s1,s2)); 
  }
  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);

    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) {
        return false;
      }
    }

    return true;
  }
}
