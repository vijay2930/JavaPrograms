
/**
    Given the radius of two concentric circle, find the area of the space between the circles.
 */
import java.util.Scanner;

public class Prgm17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the outer circle: ");
        double outerRadius = sc.nextDouble();
        System.out.print("Enter the radius of the inner circle: ");
        double innerRadius = sc.nextDouble();

        double area = Math.PI * (outerRadius * outerRadius - innerRadius * innerRadius);

        System.out.printf("The area of the space between the circles is %.2f", area);
    }
}

