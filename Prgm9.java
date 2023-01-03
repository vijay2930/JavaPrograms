/**
Given two sorted arrays, merge them such that the elements are not repeated
 */
import java.util.*;
public class Prgm9 {
  public static int[] mergeArrays(int[] array1, int[] array2) {
    ArrayList<Integer> mergedArray=new ArrayList<Integer>();

    int index1 = 0, index2 = 0;

    for (int i = 0; i < array1.length+array2.length; i++) {
      if (index1 < array1.length && index2 < array2.length) {
        if (array1[index1] < array2[index2]) {
          mergedArray.add(array1[index1]);
          index1++;
        } else if (array1[index1] > array2[index2]) {
          mergedArray.add(array2[index2]);
          index2++;
        } else {
          mergedArray.add(array1[index1]);
          index1++;
          index2++;
        }
      } else if (index1 < array1.length) {
        mergedArray.add(array1[index1]);
        index1++;
      } else if (index2 < array2.length) {
        mergedArray.add(array2[index2]);
        index2++;
      }
    }
    int arr[]=new int[mergedArray.size()];
    for(int i=0;i<arr.length;i++){
      arr[i]=mergedArray.get(i);
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] array1 = { 2,4,5,6,7,9,10,13};
    int[] array2 = { 2,3,4,5,6,7,8,9,11,15};
    System.out.println("Original Arrays:");
    System.out.println("Array 1: "+Arrays.toString(array1));
    System.out.println("Array 2: "+Arrays.toString(array2));
    System.out.println("Merged Array:");
    int []mergedArray = mergeArrays(array1, array2);
      System.out.println(Arrays.toString(mergedArray)); 
  }
}
