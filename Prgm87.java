// Java Program to convert char array to string without using toString() method
public class Prgm87 {
  public static void main(String[] args) {
    char[] array = {'H', 'e', 'l', 'l', 'o'};

    String str = charArrayToString(array);
    System.out.println(str);
  }

  public static String charArrayToString(char[] array) {
    StringBuilder sb = new StringBuilder();
    for (char c : array) {
      sb.append(c);
    }
    return sb.toString();
  }
}
