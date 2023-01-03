// Java Program to display the upper triangular matrix

public class Prgm83 {
  public static void main(String[] args) {
    // Create a matrix
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] upperTriangular = upperTriangularMatrix(matrix);
    for (int i = 0; i < upperTriangular.length; i++) {
      for (int j = 0; j < upperTriangular[i].length; j++) {
        System.out.print(upperTriangular[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] upperTriangularMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] upperTriangular = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i <= j) {
          upperTriangular[i][j] = matrix[i][j];
        } else {
          upperTriangular[i][j] = 0;
        }
      }
    }
    return upperTriangular;
  }
}
