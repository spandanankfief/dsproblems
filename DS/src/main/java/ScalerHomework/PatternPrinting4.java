package ScalerHomework;

/**
 * Created by Spandana.K on 20-09-2022.
 */
public class PatternPrinting4 {

    public static int[][] solve(int A) {
        int[][] res = new int [A][A];

        if(A == 0)
            return res;

        res[0][0] = 1;

        for(int i = 1; i< A; i++){
            for(int j = 0; j<A; j++){
                if (j == 0){
                    res[i][j] = 1;
                }else if (j == i){
                    res[i][j] = res[i-1][j-1] + 1;
                } else{
                    res[i][j] = res[i-1][j] + res[i-1][j+1];
                }

            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] ans = solve(2);
        for(int i = 0; i< ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.println(ans[i][j]);
            }
        }

        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

    }
}
