package arrays;

/**
 * Created by Spandana.K on 26-08-2022.
 */
public class StringSubSequence {

    // Print ag subsequence
    public static int findGivenSubSequenceInString(String[] str){
        int n = str.length;
        int ans = 0;
        int gCount =0;
        for (int i = n-1; i>=0; i--){ // iterate from last element of array
            if (str[i] == "g"){
                gCount++;
            } else if (str[i]== "a"){
                ans += gCount;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] input = new String[]{"c","a","b","g","e","g","a","x","g","l","g"};
        System.out.println(findGivenSubSequenceInString(input));
      //  int[][] A = new int[][]{{1,3},{5,6}};
      //  int length = A.length;
       // System.out.println(length);

    }
}
