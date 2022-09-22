package hashmaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Spandana.K on 29-08-2022.
 */
public class FindPairsWhoseSumIsPresent {

        public static int solve(Integer[] A) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            int count = 0;
            for(int i = 0; i< A.length; i++){
                set.add(A[i]);
            }
            for(int i = 0; i< A.length; i++){
                for(int j =i+1; j < A.length; j++){
                    sum = A[i] + A[j];
                    if(set.contains(sum)){
                        count++;
                    }
                }
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(solve(new Integer[]{ 14, 13, 1, 15, 11, 3, 9, 6, 7, 2, 12, 8, 4, 10, 5 }));

    }

}
