/**
Write a program to display the number in reverse order without use of String functions.
Eg 1:  Input: 12345
Output :The number in reverse order is : 54321
 */
import java.util.Scanner;
class Prgm51{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=(rev*10)+n%10;
            n/=10;
        }
        System.out.println("Reversed number is : "+rev);
    }
}