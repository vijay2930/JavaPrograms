// Java Program to determine whether a given matrix is a sparse matrix

public class Prgm80 {
  public static void main(String[] args) {
    int[][] matrix = {{0, 0, 0}, {0, 5, 0}, {0, 0, 0}};

    boolean isSparse = isSparseMatrix(matrix);
    if (isSparse) {
      System.out.println("The matrix is a sparse matrix.");
    } else {
      System.out.println("The matrix is not a sparse matrix.");
    }
  }

  public static boolean isSparseMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int nonZeroCount = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] != 0) {
          nonZeroCount++;
        }
      }
    }
    return nonZeroCount < rows * cols / 2;
  }
}
