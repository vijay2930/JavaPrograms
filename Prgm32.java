/**
 Program to Check Whether a Number is Positive or Negative
 */
import java.util.Scanner;

class Prgm32{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println(num + " is a positive number.");
        } else if(num < 0) {
            System.out.println(num + " is a negative number."); 
        } else {
            System.out.println(num + " is neither positive nor negative.");
        }
    }
}