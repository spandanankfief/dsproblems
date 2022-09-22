package hashmaps;

/**
 * Created by Spandana.K on 29-08-2022.
 */
public class FindprefixSum {
    public static int[] solve(int[] A){
        int[] prefixSumArr = new int[A.length];
        prefixSumArr[0] = A[0];
        /*ps[0] = A[0]
        * ps[1] = ps[0] + A[1]
        * ps[2] = ps[1] + A[2]
        *  int i = 1
        * ps[i-1] + A[i]
        *
        * */
        for (int i = 1; i<A.length; i++){
            //int = 1 =>  ps[i] = ps[i-1] + A[i]
            prefixSumArr[i] = prefixSumArr[i-1]+ A[i];
        }
        return prefixSumArr;

    }
    public static void main(String[] args) {
        int[] resArr = solve(new int[]{1,2,3,4,5});
        for (int i =0; i< resArr.length; i++){
            System.out.println(resArr[i]);
        }
    }
}
