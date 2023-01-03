/**
Java Program to print the elements of an array present on odd position
 */

class Prgm37{
    public static void main(String []arg){
        int n[]={0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<n.length;i++){
            if(i%2==1)
                System.out.println(n[i]);
        }
    }
}