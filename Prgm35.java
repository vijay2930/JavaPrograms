/**
Program to Find Factorial of a Number and the factorial number's sum of digits.
 */
import java.util.Scanner;

public class Prgm35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        long temp=factorial;
        while(temp!=0){
            sum+=temp%10;
            temp/=10;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
        System.out.println("The sum of the digits of the factorial is: " + sum);
    }
}
