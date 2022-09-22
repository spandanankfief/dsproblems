package hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Spandana.K on 27-08-2022.
 */
public class FindFirstDuplicat {

    public static int solve(int[] A) {
        int countIndex = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = A.length-1; i>=0; i--){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
                countIndex = i;
            }else{
                map.put(A[i],1);
            }
        }

        if (map.get(A[countIndex]) == 1){
            return -1;
        }

        return A[countIndex];
    }


    public static void main(String[] args) {
        int res = solve(new int[] { 8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16, 3});
        System.out.println(res);
    }
}
