package arrays;

import java.util.Arrays;

/**
 * Created by Spandana.K on 29-07-2021.
 */
public class ReverseArray {

    public static int[] reverseArray(int arr[], int size){
        int temp;
        for (int i =0; i< size/2; i++){
            temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
        System.out.println("Reversed Array: \n" + Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,9,10,7,5,4};
        System.out.println("Original Array: \n" + Arrays.toString(arr));
        //reverseArray(arr,arr.length);
        reverseArr(arr, arr.length);
    }

    public static int[] reverseArr(int arr[], int size){
        int start = 0;
        int end = size-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: \n" + Arrays.toString(arr));
        return arr;
    }

}
