/**
Java Program to left rotate the elements of a multidimensional array.
 */
import java.util.Arrays;
public class Prgm11 {
    public static int[][] leftRotate(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] rotatedArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedArray[i][j] = array[j][rows - 1 - i];
            }
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\nBefore Rotation ");
        for(int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        int[][] rotatedArray = leftRotate(array);
        System.out.println("\nAfter Rotation ");
        for(int[] row : rotatedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
