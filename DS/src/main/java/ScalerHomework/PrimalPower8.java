package ScalerHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PrimalPower8 {
    public static int solve(ArrayList<Integer> A) {
        int N = A.size();
        int countP = 0;
        for (int i = 0; i < N;i++){
            if(A.get(i) > 1){
                boolean check = true;
                for (int j = 2; j * j<= A.get(i);j++){
                    if(A.get(i) % j == 0){
                        check = false;
                    }
                }
                if(check){
                    countP++;
                }
            }
        }

        return countP;
    }

    public static void main(String[] args) {
        ArrayList<Integer> resultArr = new ArrayList<Integer>(Arrays.asList(-6, 10, 12));
        System.out.println(solve(resultArr));
    }
}
