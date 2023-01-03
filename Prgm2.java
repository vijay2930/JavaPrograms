/**
Write a program to print a letters from the user input character to "Z" without using Strings.
 */
import java.util.Scanner;

public class Prgm2 {
    static void printCharacters(char ch){
        for (char i = ch; i <= 90; i++) {
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toUpperCase().charAt(0);
        printCharacters(ch);
    }
}






