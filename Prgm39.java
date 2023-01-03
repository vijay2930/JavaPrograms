/**
Java Program to print the smallest element in an array
 */


public class Prgm39 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i];
        }
        }

        System.out.println("The smallest element is: " + smallest);
    }
}
