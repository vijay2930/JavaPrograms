/**
Program to Find the Largest Number Among Three Numbers
 */
import java.util.Scanner;
class Prgm30{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int largest = num1;
        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }
        
        System.out.println("Largest number: " + largest); 
    }
}