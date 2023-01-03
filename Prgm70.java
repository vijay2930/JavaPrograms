// Java Program to find the 2nd Largest Number in an Array

class Prgm70{
    static void secondlarger(int arr[]){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }
            else if(second<arr[i]){
                second=arr[i];
            }
        }
        System.out.println("second :"+second);
    }
    public static void main(String []arg){
        int arr[]={1,2,3,4,5,6,7};
        secondlarger(arr);
    }
}