/**Write a program to sort the elements in odd positions in descending order and
elements in ascending order.
*/


class Prgm54{
    public static void main(String []arg){
        int arr[]={13,2,4,15,12,10,5};
        int temp;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]<arr[i+2]){
                temp=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=temp;
            }
            i++;
            if(i+2>=arr.length){
                continue;
            }
            if(arr[i]>arr[i+2]){
                temp=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
