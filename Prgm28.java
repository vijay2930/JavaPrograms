/**
Program to Check Whether a Number is Even or Odd
 */
import java.util.Scanner;

public class Prgm28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if ((num&1)==0) {
      System.out.println(num + " is even");
    } else {
      System.out.println(num + " is odd");
    }
  }
}
