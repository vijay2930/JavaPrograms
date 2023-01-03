/**
Program to Find the Roots of a Quadratic Equation
 */
import java.util.Scanner;

class Prgm31{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the c: ");
        double c = sc.nextDouble(); 
        double d = b*b - 4*a*c; 
        if(d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2*a);
            double root2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Root of the equation: " + root1+","+root2);

        } else if(d == 0) {
            double root = -b / (2*a);
            System.out.println("Root of the equation: " + root);
        } else {
            System.out.println("Equation has no real roots.");
        }
    }

}