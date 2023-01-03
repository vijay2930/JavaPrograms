// Java program to find a character in a given string using binary search.
import java.util.*;
import java.util.Scanner;
public class Prgm97 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string :");
    String s=sc.nextLine();
    System.out.print("Enter the charater:");
    char c=sc.next().charAt(0);
    System.out.println(binarySearch(s, c));
  }
  public static int binarySearch(String word, char c) {
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    int start = 0;
    int end = chars.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (c < chars[mid]) {
        end = mid - 1;
      } else if (c > chars[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
