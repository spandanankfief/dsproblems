package arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class FindDuplicateElement {
    //O(n) time complexity
    //O(n) space complexity bcz of set
    public static int findDuplicateElement(int[] arr){
        int duplicateElement = 0;
        int size = arr.length;

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<size;i++){
            if (!set.add(arr[i])){
                duplicateElement = arr[i];
            }else {
                set.add(arr[i]);
            }
        }

        return duplicateElement;
    }

    public static void findDuplicateElementInConstantTime(int[] arr){
        int size = arr.length;
        for (int i=0; i<size;i++) {
            int absVal = Math.abs(arr[i]);
            if (arr[absVal] >= 0){
                arr[absVal] = -arr[absVal];
            }else {
                System.out.println(absVal + " ");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,2,3};
       // System.out.println(findDuplicateElement(arr));
        findDuplicateElementInConstantTime(arr);
    }
}
