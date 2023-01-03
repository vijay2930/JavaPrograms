/**
 Java Program to left rotate the elements of an array
 */
class Prgm43{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int n = 3; 
        for(int i = 0; i < n; i++) {
            int temp = arr[0];
            for(int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
}

}