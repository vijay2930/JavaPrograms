// Java Program to rotate the elements of an array in the right direction

import java.util.Arrays;

public class Prgm69 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    int n = 2;
    rotateArray(arr, n);
    System.out.println(Arrays.toString(arr));
  }

  public static void rotateArray(int[] arr, int rotation) {
    int n = arr.length;
    rotation %= n;
    int temp;
    for (int i = 0; i < rotation; i++) {
      temp = arr[n - 1];
      for (int j = n - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = temp;
    }
  }
}

