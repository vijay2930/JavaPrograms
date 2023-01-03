// java Program to convert ASCHII value to character(for A-Z only) without using special function
import java.util.Scanner;
public class Prgm100 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the ASCII Value : ");
    int c=sc.nextInt();
    System.out.println(asciiToChar(c)); 
  }
  public static char asciiToChar(int ascii) {
    if (ascii < 65 || ascii > 90) {
      throw new IllegalArgumentException("ASCII value must be in the range of A-Z");
    }
    return (char)ascii;
  }
}
