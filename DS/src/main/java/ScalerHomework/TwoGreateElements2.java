package ScalerHomework;

import java.util.Arrays;

/**
 * Created by Spandana.K on 19-09-2022.
 */
public class TwoGreateElements2 {

    public static int[] solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int[] ans = new int[n-2];
        for (int i = 0 ; i < n-2; i++) {
            ans[i] = A[i];
        }
        return ans;
    }

    public static int[] solve1(int[] A) {
        int n = A.length;
        int[] ans = new int[n-2];

        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        //Loop to find first and second largest element
        for (int i = 0 ; i < n; i++) {
            if (A[i] > first){
                second = first;
                first = A[i];
            }
            else if (A[i] > second)
                second = A[i];
        }

        int count =-1;
        for (int i = 0 ; i < n; i++) {
            if (A[i] < second){
                count++;
                ans[count] = A[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{  5, 17, 100, 11 };
        int[] ans = new int[arr.length-2];
        ans =  solve1(arr);
        for (int i =0; i<ans.length; i++){
            System.out.print(ans[i]+" ");

        }
    }
}
