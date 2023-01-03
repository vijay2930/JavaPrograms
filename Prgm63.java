// Java Program to print the largest element and smallest element in an array

class Prgm63{
    static void largestAndSmallest(int []arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        System.out.printf("Smallest :%d Largest: %d",min,max);
    }
    public static void main(String []arg){
        int arr[]={17,2,3,4,5,6};
        largestAndSmallest(arr);
    }
}