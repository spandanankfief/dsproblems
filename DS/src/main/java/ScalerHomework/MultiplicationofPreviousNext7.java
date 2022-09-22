package ScalerHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationofPreviousNext7 {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        if (A.size() == 1)
            return A;
        int first  = A.get(0) * A.get(1);
        int temp = A.get(0);
        A.set(0,first);

        for (int i = 1; i <= A.size()-1; i++){
            int res = 0;
            if (i == A.size() - 1){
                res = temp * A.get(i);
                A.set(i, res);
            }else {
                res = temp * A.get(i + 1);
                temp = A.get(i);
                A.set(i, res);
            }
        }
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> resultArr = new ArrayList<Integer>(Arrays.asList(0));
        System.out.println(solve(resultArr));
    }
}
