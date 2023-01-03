// Java Program to print the print the equivalent Capital letter of a given small letter in Alphabets.

import java.util.Scanner;
public class Prgm98 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  System.out.print("Enter the Character : ");
    char c=sc.next().charAt(0);
    System.out.println(getCapitalLetter(c)); 
  }
  public static char getCapitalLetter(char c) {
    if (c < 'a' || c > 'z') {
      throw new IllegalArgumentException("Character must be a lowercase letter");
    }
    return (char)(c - 32);
  }
}
