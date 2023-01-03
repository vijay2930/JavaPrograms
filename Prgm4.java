/**
Write a program to define the functionality of a bitwise operators.
 */


class Prgm4{
    public static void main(String arg[]){
        
        int a=10,b=15;
        // Bitwise AND operator
        System.out.println("a & b = " + (a & b)); 
        
        // Bitwise OR operator
        System.out.println("a | b = " + (a | b)); 
        
        // Bitwise XOR operator
        System.out.println("a ^ b = " + (a ^ b)); 
        
        // Bitwise NOT operator
        System.out.println("~a = " + ~a); 
        
        // Bitwise left shift operator
        System.out.println("a << 2 = " + (a << 2)); 
        
        // Bitwise right shift operator
        System.out.println("a >> 2 = " + (a >> 2)); 
        
        // Bitwise right shift operator (zero fill)
        System.out.println("a >>> 2 = " + (a >>> 2)); 

    }
}