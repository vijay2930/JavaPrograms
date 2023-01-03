/**
Write a program to print the following pattern for the given input number.
********
***--***
**----**
*------*
**----**
***--***
********
 */
import java.util.Scanner;

public class Prgm58 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read the size of the pattern from the user
    System.out.print("Enter the size of the pattern: ");
    int size=sc.nextInt();
    int star=size+1;
    int hyphen=-1;
    for (int i = 1; i < size*2 ; i++) {
      if(i>size){star++;hyphen--;}
      else{star--;hyhpen++;}
      for (int j = 0; j < star; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < hyphen*2; j++) {
        System.out.print('-');
      }
      for (int j = 0; j < star; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
