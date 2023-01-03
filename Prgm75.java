// Print Odd and Even Number from an Array

import java.util.Arrays;

public class Prgm75 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.print("Odd numbers: ");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 1) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();

    System.out.print("Even numbers: ");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }
}
