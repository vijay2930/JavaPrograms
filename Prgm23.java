/**
What is the value of x1 if x=5 ?
x1=++x – x++ + –x
 */
class Prgm23{
    public static void main(String arg[]){
        int x=5,x1=0;
        // x1= ++x - x++ + --x;
        // x1= 6 - 6 + 6
        // x1=6
        System.out.println("Expression:\nx1=++x - x++ + --x\n");
        System.out.printf("After:x=%d,x1=%d\n",x,x1);
        x1= ++x - x++ + --x;
        System.out.printf("Before:x=%d,x1=%d",x,x1);
    }
}