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
        reverseArray(arr,arr.length);



    }
}
