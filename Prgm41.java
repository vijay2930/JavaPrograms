/**
Java Program to copy all elements of one array into another array
 */

import java.util.Arrays;
public class Prgm41 {
    public static void main(String[] args) {
        int[] src = {1, 3, 5, 2, 4, 6};
        int[] dest = new int[src.length];

        for (int i = 0; i < src.length; i++) {
        dest[i] = src[i];
        }
        System.out.println("Original Arrays : "+Arrays.toString(src));
        System.out.println("Copy Arrays : "+Arrays.toString(dest));
        
    }
}
