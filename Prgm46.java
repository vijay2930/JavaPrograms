/**
Java Program to rotate the elements of an array in the right direction
 */

public class Prgm46 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n=3;
        for(int j=0;j<n;j++){
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
        arr[0] = last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }
}
