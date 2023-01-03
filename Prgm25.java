/**
Program to Compute Quotient and Remainder
 */
import java.util.Scanner;

public class Prgm25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.printf("The quotient is %d and the remainder is %d", quotient, remainder);
    }
}
