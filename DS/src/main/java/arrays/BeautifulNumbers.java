package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Created by Spandana.K on 02-08-2021.
 */
public class BeautifulNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static long solve(int l, int r){
        // Your code goes here
        long sum = 0;
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        for(int i = l; i<=r; i++){
            if(map.containsKey(i) && map.get(i)){
                sum += i;
            }else if(!map.containsKey(i) && isExpected(i,map)){
                sum += i;
            }
        }
        return sum;
    }
    public static Boolean isExpected(int i, HashMap<Integer,Boolean> map){
        int cur = i;
        if(i==0){
            return false;
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        map.put(i, false);

        int temp =0 ;
        while(i>0){
            int rem = i%10;
            temp+= rem*rem;
            i/=10;
        }

        if(temp == 1){
            map.put(cur, true);
            return true;
        }

        boolean flag = isExpected(temp, map);
        map.put(cur, flag);
        return flag;

    }
}
