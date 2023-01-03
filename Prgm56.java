/**
Write a program to make such a pattern like a pyramid with numbers increased by 1.
Eg:  Input : 10
Output:
     1
    2 3
   4 5 6
7 8 9 10
 */
import java.util.Scanner;
class Prgm56{
    public static void main(String []arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the pyramid: ");
        int n = scanner.nextInt();
        int k=1;
        outer:
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" "+k);
                k+=1;
                if(k>n)
                    break outer;
            }
            System.out.println();
        }
    }
}