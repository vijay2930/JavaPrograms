/**
Program to Swap Two Numbers
 */
import java.util.Scanner;
class Prgm27{
    public static void main(String []arg){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();
      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();
      System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2); 
      num1^=num2;
      num2^=num1;
      num1^=num2;
      System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2); 
    }
}