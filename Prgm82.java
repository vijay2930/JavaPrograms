// Java Program to display the lower triangular matrix

public class Prgm82 {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] lowerTriangular = lowerTriangularMatrix(matrix);
    for (int i = 0; i < lowerTriangular.length; i++) {
      for (int j = 0; j < lowerTriangular[i].length; j++) {
        System.out.print(lowerTriangular[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] lowerTriangularMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] lowerTriangular = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i >= j) {
          lowerTriangular[i][j] = matrix[i][j];
        } else {
          lowerTriangular[i][j] = 0;
        }
      }
    }
    return lowerTriangular;
  }
}
