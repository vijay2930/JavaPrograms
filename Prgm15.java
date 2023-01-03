/**
Write a program to find the area of the cylinder
 */


import java.util.Scanner;

public class Prgm15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        double baseArea = Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        double totalArea = 2 * baseArea + lateralArea;

        System.out.printf("The area of the cylinder is %.2f", totalArea);
    }
}
