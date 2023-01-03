// Java Program to subtract the two matrices

public class Prgm78 {
  public static void main(String[] args) {
    int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

    int[][] result = subtractMatrices(matrix1, matrix2);

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
    int rows = matrix1.length;
    int cols = matrix1[0].length;
    int[][] result = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
    return result;
  }
}
