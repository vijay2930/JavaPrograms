/**
 Write a program to print the alphabet 'C' with the stars based on the given numbers
Eg 1:  Input: 4
        Output:
****
*
*
****
 */
import java.util.Scanner;
class Prgm55{
    public static void main(String []arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the alphabet: ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}