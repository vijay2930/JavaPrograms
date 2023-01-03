/**
Java Program to print the largest element in an array
 */

public class Prgm38 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
        }
        System.out.println("The largest element is: " + largest);
    }
}
