/**
Write a program to find the area of the square
 */

import java.util.Scanner;

public class Prgm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of one side of the square: ");
        double sideLength = sc.nextDouble();

        double area = sideLength * sideLength;

        System.out.printf("The area of the square is %f", area);
    }
}
