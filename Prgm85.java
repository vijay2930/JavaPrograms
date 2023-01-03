// Java Program to find the sum of each row and each column of a matrix

public class Prgm85 {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    for (int i = 0; i < matrix.length; i++) {
      int rowSum = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        rowSum += matrix[i][j];
      }
      System.out.println("Row " + (i + 1) + " sum: " + rowSum);
    }

    for (int j = 0; j < matrix[0].length; j++) {
      int colSum = 0;
      for (int i = 0; i < matrix.length; i++) {
        colSum += matrix[i][j];
      }
      System.out.println("Column " + (j + 1) + " sum: " + colSum);
    }
  }
}
