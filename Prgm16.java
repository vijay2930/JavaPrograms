/**
Write a program to evaluate the polynomial equation
    ax^2+bx+c=0

    x=(-b)+/-(sqrt(b^2-4ac))/2a
 */
import java.util.Scanner;
class Prgm16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = sc.nextDouble();
        double discriminant = b*b - 4*a*c; 
    
        if(discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("Roots of the equation: " + root1 + ", " + root2); 
        }else if(discriminant == 0) {
            double root = -b / (2*a);
            System.out.println("Root of the equation: " + root);
        }else {
            System.out.println("Equation has no real roots.");
        }
    }
}