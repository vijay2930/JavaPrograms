// Java Program to copy all elements of one array into another array
import java.util.Arrays;
class Prgm64{
    public static void main(String []arg){
        int arr[]={1,2,3,4,5,6,7};
        int copyarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copyarr[i]=arr[i];
        }
        System.out.println("Original Array:"+Arrays.toString(arr));
        System.out.println("Copied Array:"+Arrays.toString(copyarr));
    }
}