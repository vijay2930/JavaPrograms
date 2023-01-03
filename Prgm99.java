// Java Program to convert all small letter to capital letter without using special functions.

import java.util.Scanner;
public class Prgm99 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the word  : ");
    String s=sc.nextLine();
    System.out.println(toCapital(s));
  }
  public static String toCapital(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= 'a' && chars[i] <= 'z') {
        chars[i] = (char)(chars[i]-32);
      }
    }
    return new String(chars);
  }
}
