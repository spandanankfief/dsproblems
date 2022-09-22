package hashmaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Spandana.K on 26-08-2022.
 */
public class FindIntersectionsOfArray {
    public static int[] findIntersections(int[]A, int[]B){
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i<A.length;i++){
            set.add(A[i]);
        }

        for (int i =0; i<B.length; i++){
            if (set.contains(B[i])){
                arrList.add(B[i]); // add duplicate elements in array to print result
            }else {
                set.add(B[i]);
            }
        }
        int[] resArr = new int[arrList.size()];

        for (int i=0; i<arrList.size();i++){
            resArr[i] = arrList.get(i);
        }
        return resArr;
    }
    public static void main(String[] args) {
       int[] result = findIntersections(new int[]{1,3,5,6,2,6,8}, new int[]{1,5,9,6,8});
        for (int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
}
