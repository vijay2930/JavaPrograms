// Java Program to print the sum of all the items of the array
class Prgm68{
    static void sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String []arg){
        int arr[]={1,2,3,4,5,6,7,8};
        sum(arr);
    }
}