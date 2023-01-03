// Java Program to determine whether a given matrix is an identity matrix

public class Prgm79 {
  public static void main(String[] args) {
    int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

    boolean isIdentity = isIdentityMatrix(matrix);
    if (isIdentity) {
      System.out.println("The matrix is an identity matrix.");
    } else {
      System.out.println("The matrix is not an identity matrix.");
    }
  }

  public static boolean isIdentityMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    if (rows != cols) {
      return false;
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i == j && matrix[i][j] != 1) {
          return false;
        }
        if (i != j && matrix[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }
}
