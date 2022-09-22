package arrays;

/**
 * Created by Spandana.K on 26-08-2022.
 */
public class SumOfKFindPairs {
//revisit
    public static int findPairs(int[] A,int sum){
        int start = 0 ;
        int end = A.length-1;
        int count=0;
        int ans = 0;
        while (start < end){
            if(A[start] + A[end] > sum){
                end--;
            }else if (A[start] + A[end] < sum){
                start++;
            }else {
                int temp1 = A[start];
                int temp2 = A[end];
                int c1=0;
                int c2=0;
                while (A[start]+1 != temp1) {
                    start++;
                    c1++;
                }
                while (A[end]+1 != temp2){
                    end--;
                    c2++;
                }

              ans = c1*c2;
            }

        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,5,5,6,6,11};
        System.out.println("No of pairs : "+findPairs(arr,11));
    }
}
