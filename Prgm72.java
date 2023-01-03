// java Program to remove duplicate element in an array
import java.util.Arrays;

public class Prgm72 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

    int[] result = removeDuplicates(arr);

    System.out.println(Arrays.toString(result));
  }

  public static int[] removeDuplicates(int[] arr) {
    int n = arr.length;
    int[] temp = new int[n];
    int j = 0;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        temp[j++] = arr[i];
      }
    }
    temp[j++] = arr[n - 1];

    int[] result = new int[j];
    for (int i = 0; i < j; i++) {
      result[i] = temp[i];
    }
    return result;
  }
}

