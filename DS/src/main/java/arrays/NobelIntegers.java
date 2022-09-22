package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Spandana.K on 30-08-2022.
 */
public class NobelIntegers {
    public static boolean solve(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i=0; i<n; i++){
            for (int j =0; j<n; j++){
                if (arr[i] < arr[j]){
                    count++;
                }
            }
            if (count == arr[i])
            {

                return true;
            }
        }
        return false;
    }

    public static boolean solveOptimal(ArrayList<Integer> arr){
        int n = arr.size();
        Collections.sort(arr);
        Collections.reverse(arr);
        for (int i=0; i<n; i++){
           if (arr.get(i)==i){
               if (i>0 && arr.get(i-1) != arr.get(i))
               return true;

           }
        }
        return false;
    }

   /* int n = A.size();
        Collections.sort(A);
        for (int i=0; i<n; i++){
        while(i+1<n && A.get(i)==A.get(i+1))
            i++;
        if(A.get(i) == n-1-i)
            return true;
    }
        return false;*/
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(2);
        System.out.println(solveOptimal(arr));
    }
}
