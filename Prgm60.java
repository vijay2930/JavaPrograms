/**
Write a program to find the sum of the series. The series will be like 1 +11 + 111 + 1111 +.. n terms.
 */
import java.util.Scanner;
class Prgm60{
    static int sum(int n){
        int sum=0;
        int i=0;
        int num=1;
        while(i<n){
            sum+=num;
            num=num*10+1;
            i++;
        }
        return sum;
    }
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}