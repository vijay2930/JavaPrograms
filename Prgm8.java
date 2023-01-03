/**
Write a program to demonstrate the functionalities of static keyword.
 */
public class Prgm8 {
    private static int counter = 0;
    public static void incrementCounter() {
        counter++;
    }
    public static void main(String[] args) {
       Prgm8 obj1 = new Prgm8();
       Prgm8 obj2 = new Prgm8();

        obj1.incrementCounter();
        System.out.println("Counter value: " + counter); 
        obj2.incrementCounter();
        System.out.println("Counter value: " + counter); 
        Prgm8.counter ++;
        Prgm8.incrementCounter();
        System.out.println("Counter value: " + Prgm8.counter); 
    }
}
