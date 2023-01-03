/**
Java Program to print the sum of all the items of the array
 */

public class Prgm45 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the elements is: " + sum);
    }
}
