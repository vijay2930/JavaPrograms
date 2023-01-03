// Java Program to display the transpose matrix

public class Prgm76 {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] transpose = transposeMatrix(matrix);
    for (int i = 0; i < transpose.length; i++) {
      for (int j = 0; j < transpose[i].length; j++) {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] transposeMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] transpose = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }
    return transpose;
  }
}
