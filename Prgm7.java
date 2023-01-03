/**
Write a program to print the following output for the given input. You can assume the string is of odd length
Input: 12345
Output:
1       1
  2   2
    3
  4   4
5        5

 */
import java.util.Scanner;
class Prgm7{
    static void pattern(String str){
        int len = str.length();
        for(int i=0;i<len;i++){
            int j=len-i-1;
            for(int k=0;k<len;k++){
                if(k==i || k==j){
                    System.out.print(str.charAt(i));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        pattern(str);
    }
}



