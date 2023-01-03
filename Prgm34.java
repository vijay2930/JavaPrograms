/**
Program to Calculate the Sum of Natural Numbers and find the largest digit of the sum
 */
import java.util.Scanner;

public class Prgm34 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        int sum = 0;
        int largestDigit = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        int temp=sum;
        while(temp!=0){
            int cur=temp%10;
            if(cur>largestDigit)
                largestDigit=cur;
            temp/=10;
        }

        System.out.println("The sum of the natural numbers is: " + sum);
        System.out.println("The largest digit of the sum is: " + largestDigit);

    }
}
