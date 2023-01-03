/**Using Recursion reverse the string such as
Eg 1:  Input: one two three
       Output: three two one
Eg 2:  Input: I love india
       Output: india love I
*/

public class Prgm52 {
    public static String reverseString(String str[], int count) {
        if (count == 0) {
        return str[count];
        }
        return str[count] + " " + reverseString(str, count - 1);
    }

    public static void main(String[] args) {
        String str = "one two three";

        String reversed = reverseString(str.split(" "),str.split(" ").length - 1);

        System.out.println(reversed);
    }
}


