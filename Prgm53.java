/**
Write a program to give the following output for the given input:   
Eg 1:   Input: a1b10
        Output: abbbbbbbbbb
Eg: 2:  Input: b3c6d15
        Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
*/
import java.util.Scanner;
class Prgm53{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.next();
        String temp1="";
        int temp2=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isLetter(c)){
                temp2=(temp2*10)+Integer.parseInt(c+"")-temp2;
                if(temp1!=""){
                    for(int j=0;j<temp2;j++){
                        System.out.print(temp1);
                    }
                }
            }else{
                temp1=c+"";
                temp2=0;
            }
        }
    }
}
