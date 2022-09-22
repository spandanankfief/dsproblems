package ScalerHomework;

/**
 * Created by Spandana.K on 19-09-2022.
 */
public class SmallerandGreater1 {

    public static int solve(int[] nums) {
      /*  int ans = 0;
        Arrays.sort(A);
        for(int i = 1; i<A.length-1;i++){
            if (i ==1 && A[i] == A[i-1]){
                ans =0;
            }else if(A[i] == A[i-1]){
                if(A[i] > A[i-2] && A[i] < A[i+1])
                    ans++;
            }else  if(A[i] == A[i+1]){
                if(A[i] > A[i-1] && A[i] < A[i+2])
                    ans++;}
            if(A[i] > A[i-1] && A[i] < A[i+1])
                ans++;
        }
        return ans;*/


        int max=Integer.MIN_VALUE;// min to max
        int min=Integer.MAX_VALUE; // max to min

        for (int i : nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i] < max && nums[i] > min){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 3,1,2,3,1,5,4 };
        int ans = solve(arr);
        System.out.printf("answer : " + ans);
    }
}
