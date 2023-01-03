// Java Program to print the elements of an array present on even position and odd positions

class Prgm62{
    static void evenAndOdd(int arr[]){
        System.out.println("\nEven Position Elements:");
        for(int i=0;i<arr.length;i+=2)
            System.out.print(" "+arr[i]);
        System.out.println("\nOdd Position Elements:");
        for(int i=1;i<arr.length;i+=2)
            System.out.print(" "+arr[i]);
        }
    public static void main(String []arg){
        int arr[]={0,1,2,3,4,5,6,7};
        evenAndOdd(arr);
    }
}