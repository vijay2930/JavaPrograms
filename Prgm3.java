/**
Write a program to find the difference between the given number and it's reverse number.
 */
import java.util.Scanner;
public class Prgm3 {
    static int diff(int num){
        int rev = 0;
        int temp=num;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return num-rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Difference between the number and its reverse: " + diff(num));
}
}