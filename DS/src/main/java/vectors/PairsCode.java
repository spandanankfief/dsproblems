package vectors;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by Spandana on 15-07-2021.
 */

//Time complexity - O(n)
public class PairsCode {
    public static Vector<Integer> findPairsOfGivenSum(Vector<Integer> inputArr, int sum) {
        Vector<Integer> res = new Vector<>();
        Set<Integer> inputSet = new HashSet<>();
        for (int val : inputArr) {
            int complimentVal = sum - val;
            //System.out.println("for val: "+ val + ":" + complimentVal);
            if (!inputSet.add(complimentVal)){
                //  System.out.println("Found the pair :" + val + ":" + complimentVal);
                res.add(val);
                res.add(complimentVal);
                return res;
            }
            inputSet.add(val);

        }
        System.out.println("Output pairs: " + res);
        return res;
    }

    //Time complexity - O(n)
    public static void findCloserSumPairs(int[] inputArr, int sum) {
        int l=0; int r=inputArr.length-1; int diff = Integer.MAX_VALUE;
        int res_l = 0; int res_r = 0;
        while (l<r){
            int absVal = Math.abs(inputArr[l] + inputArr[r] - sum);
            if (absVal < diff){
                res_l = l;
                res_r = r;
                diff = Math.abs(inputArr[l] + inputArr[r] - sum);
            }
            if (inputArr[l] + inputArr[r] < sum){
                l++;
            }else {
                r--;
            }

        }
        System.out.println("findCloserSumPairs : L:" + inputArr[res_l] + " R:"+ inputArr[res_r]);
    }
    public static void main(String[] args) {
        Vector<Integer> input = new Vector<>();
        input.addElement(1);
        input.addElement(5);
        input.addElement(6);
        input.addElement(8);
        input.addElement(10);
        input.addElement(4);
        /*input.addElement(9);
        input.addElement(11);
        input.addElement(-7);*/

        System.out.println("Input vector: " + input);
        Vector<Integer> res = findPairsOfGivenSum(input,14);
        System.out.println("Output pairs: " +res);

        findCloserSumPairs(new int[] {10,22,28,29,30,40},54);
    }
}
