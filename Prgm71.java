// Java Program to find the 2nd Smallest Number in an Array

class Prgm71{
    static void secondsmallest(int arr[]){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(first>arr[i]){
                second=first;
                first=arr[i];
            }
            else if(second>arr[i]){
                second=arr[i];
            }
        }
        System.out.println("second Smallest:"+second);
    }
    public static void main(String []arg){
        int arr[]={1,2,3,4,5,6,7};
        secondsmallest(arr);
    }
}
