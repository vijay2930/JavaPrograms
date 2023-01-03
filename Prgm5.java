/**
Write a program to print the following pattern based on the alphabet.
    Input: E
    Output:
    EEEEE
    DDDD
    CCC
    BB
    A
 */
import java.util.Scanner;

public class Prgm5 {
    static void pattern(char ch){
        for (char i = ch; i >= 65; i--) {
            for (char j = i; j >= 65; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().toUpperCase().charAt(0);
        
        pattern(ch);
    }
}