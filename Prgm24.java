/**
Program to Find ASCII Value of a Character
 */
import java.util.Scanner;

public class Prgm24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int asciiValue = (int) ch;

        System.out.printf("The ASCII value of '%c' is %d", ch, asciiValue);
    }
}

