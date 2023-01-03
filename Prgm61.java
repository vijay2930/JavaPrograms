// Java Program to print the elements of an array in reverse order
class Prgm61{
    static void printReverse(int arr[]){
        int len=arr.length;
        for(int i=len-1;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []arg){
        int arr[]={1,2,3,4,5,6};
        printReverse(arr);
    }
}