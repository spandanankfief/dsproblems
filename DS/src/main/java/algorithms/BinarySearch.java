package algorithms;

import java.util.Scanner;

/**
 * Created by Spandana.K on 29-07-2021.
 */
public class BinarySearch {
    public  static int binarySearch(int[] arr, int key){
        int s = 0; int e = arr.length -1 ;
        while (s<=e){
            int mid = (s+e)/2;
            if (arr[mid] == key){
                return mid;
            } else if(arr[mid] > key){
                e = mid -1;
            }
            else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,10,13,15};
        int key = 10;
        int res = binarySearch(arr,key);

        if (res != -1){
            System.out.println("Element found at " +  res);
        }else {
            System.out.println("Element Not found");
        }


    }
}
