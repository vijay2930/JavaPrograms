/**
Evaluate the following expression on paper and on program and understand the difference
a+=a++ + ++a + --a + a--; when a=28
 */

class Prgm19{
    public static void main(String []arg){
        int a = 28;
        // a += a++ + ++a + --a + a--;
        // a=a+(a++)+(++a)+(--a)+(a--)
        // a=28+28+30+29+29
        // a=144
        System.out.println("Expression:\na += a++ + ++a + --a + a-- When a=28");
        a += a++ + ++a + --a + a--;
        System.out.println("a="+a); 
    }
}