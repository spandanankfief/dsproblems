package ScalerHomework;

/**
 * Created by Spandana.K on 20-09-2022.
 */
public class MinimumPicks3 {
    public static int solve(int[] A) {
        int evenMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;

        for (int i =0; i< A.length; i++){
            if (A[i] % 2 == 0){
                if (A[i] > evenMax)
                    evenMax = A[i];
            }else {
                if (A[i] < oddMin)
                    oddMin = A[i];
            }
        }
        return evenMax - oddMin;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 5, 17, 100, 1 };
        int ans = solve(arr);
        System.out.printf("answer : " + ans);
    }
}
