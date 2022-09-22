package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Spandana.K on 31-08-2021.
 */
public class OddEvenSubSequence {
    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer>  resultArr = new ArrayList<Integer>();
        boolean isEvenNum = A.get(0) % 2 == 0;
        resultArr.add(A.get(0) );
        for(int i=1; i<A.size(); i++){
            if(isEvenNum && A.get(i) % 2 != 0){
                isEvenNum = false;
                resultArr.add(A.get(i));
            }
            else if(!isEvenNum && A.get(i) % 2 == 0){
                isEvenNum = true;
                resultArr.add(A.get(i));
            }
        }
        System.out.println(resultArr.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim()   );

        return resultArr.size();

    }

    public static int solve(int[] A, int B) {
        int resCounter =0;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(i!=j && A[i]+ A[j] == B){
                    resCounter++;
                }
            }
        }
        return resCounter;
    }

    public static void main(String[] args) {
       ArrayList<Integer> resultArr = new ArrayList<Integer>(Arrays.asList(12, 10, 28, 37, 43, 40, 14, 12, 48));
       System.out.println(solve(resultArr));
        //System.out.println(solve(new int[]{1,2,3,4},7));
    }
}
