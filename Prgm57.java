/**
Write a program to print the following output for the given input. You can assume
the string is of odd length
Eg 1:  Input: 12345
1   5
 2 4 
  3  
 2 4 
1   5
 */
import java.util.Scanner;
class Prgm57{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            int j=s.length()-1-i;
            for(int k=0;k<s.length();k++){
                if(k==i || k==j){
                    System.out.print(s.charAt(k));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}