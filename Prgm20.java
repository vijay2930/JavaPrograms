/**
Evaluate the following expression on paper and on program and understand the
difference
x = x++ * 2 + 3 * –x;

 */

class Prgm20{
    public static void main(String arg[]){
        int x=5;
        // x=x++ * 2 + 3 * --x;
        // x=5*2+3*5
        // x=25
        System.out.println("Expression:\nx=x++ * 2 + 3 * --x\n");
        x=x++ * 2 + 3 * --x;
        System.out.println("x="+x);
    }
    
}