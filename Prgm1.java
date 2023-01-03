
/**
Write a single program to generate a multiplication and subtraction table for a given number.
 */
import java.util.Scanner;
public class Prgm1 {
public static void generateTable(int n) {
    System.out.println("Multiplication table for " + n);
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " * " + i + " = " + n*i);
    }
    
    System.out.println("\nSubtraction table for " + n);
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " - " + i + " = " + (n-i));
    }
}

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=s.nextInt();
    generateTable(n);
}
}
