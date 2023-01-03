/**
Java Program to print the elements of an array present on even position
 */


public class Prgm36 {
    public static void main(String[] args) {
        int[] arr = {0,1, 2, 3, 4, 5, 6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
