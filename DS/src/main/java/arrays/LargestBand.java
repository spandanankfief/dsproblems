package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class LargestBand {

    public static int findLargestBand(int[] arr, int size){
        int largestBandLength = 1;
        Set<Integer> set = new HashSet<>();
        for (int t : arr) {
            set.add(t);
        }

        for (int element : set){
            int parent = element -1;
            if (!set.contains(parent)){
                int next_no = element + 1;
                int cnt = 1;

                while (set.contains(next_no)){
                    next_no++;
                    cnt++;
                }
                if (cnt > largestBandLength){
                    largestBandLength = cnt;
                }
            }
        }

        return largestBandLength;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,3,0,18,5,4,2,10,7,12,6};
        int bandLength = findLargestBand(arr,arr.length);

        System.out.println("Largest band: " + bandLength);
    }
}
