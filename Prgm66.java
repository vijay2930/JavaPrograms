//Java Program to left rotate the elements of an array

import java.util.Arrays;

public class Prgm66 {
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
      temp = arr[0];
      for (int j = 0; j < n - 1; j++) {
        arr[j] = arr[j + 1];
      }
      arr[n - 1] = temp;
    }
  }
}
