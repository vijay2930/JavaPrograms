// Java Program to print the duplicate elements of an array
import java.util.*;
class Prgm67{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4,2,3,4, 6, 3, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
        int element = arr[i];
        if (map.containsKey(element)) {
            map.put(element, map.get(element) + 1);
        } else {
            map.put(element, 1);
        }
        }
        for (int element : map.keySet()) {
            int frequency = map.get(element);
            if (frequency > 1) {
                System.out.println("Element " + element + " occurs " + frequency + " times");
            }
        }
    }
}