package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Spandana.K on 04-09-2022.
 */
public class pairsock {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Collections.sort(ar);
        int count = 0;
        int k =0;
        /*for(int i = 0; i<n; i= i+k ){
            if(ar.get(i) == ar.get(i+1)){
                k=2;
                count++;
            }else{
                k++;
            }
        }*/

        while (k<ar.size()-1){
            if(ar.get(k) == ar.get(k+1)){
                k=k+2;
                count++;
            }else {
                k ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);arr.add(20); arr.add(20); arr.add(10);arr.add(10);arr.add(30);arr.add(50);arr.add(10);arr.add(20);
        int res = sockMerchant(arr.size(), arr);
        System.out.print(res);


    }
}
