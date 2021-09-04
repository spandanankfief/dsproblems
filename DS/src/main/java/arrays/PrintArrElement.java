package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class PrintArrElement {

    public  static void printArrElement(int[] arr,int n){
        Set<Integer> set = new HashSet<>();
        int countShouldBeMoreThan = n/arr.length;
        int countOccurrences = 0;

        for (int a : arr){
            if (!set.add(a)){
            countOccurrences++;
            }
        }
    }
    public static void main(String[] args) {

    }

}
