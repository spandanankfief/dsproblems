package arrays;

import java.util.Arrays;

/**
 * Created by Spandana.K on 02-08-2021.
 */
public class LargestElement {
    public static int printLargestElementOfArr(int[] arr, int size){
        int largestElement = arr[0];
        for(int i =1; i<size; i++){
            if(arr[i] > largestElement )
                largestElement = arr[i];
        }
        return largestElement;
    }

    public static int lowerBound(int[] arr, int size, int val){
        int low = 0;
        int high =size;
        while (low < high){
            int mid = (high + low)/2;
            if (val <= arr[mid]){
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6,8};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        System.out.println(printLargestElementOfArr(arr, 5));
        System.out.println(lowerBound(arr, 5,4));
    }
}
