/**
Program to Check Whether a Character is an Alphabet or not
 */
import java.util.Scanner;
class Prgm33{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an alphabet."); 
        } else {
            System.out.println(c + " is not an alphabet.");
        }
    }
}