package hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Spandana.K on 29-08-2022.
 */
public class ReplicatingStrings {

    public static int solve(int A, String B){
        char[] charArr = B.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<charArr.length; i++){
            if (map.containsKey(charArr[i])){
                map.put(charArr[i], map.get(charArr[i])+1);
            }else {
                map.put(charArr[i],1);
            }
        }
        int flag =0;
        for (int i=0; i< map.size(); i++){
            if (map.get(i) % A != 0){
                flag = 1;
            }
            if (flag == 1){
                return -1;
            }else {
                return 1;
            }
        }
        return -1;
    }

    public static int solve1(int A, String B) {
        // hash array to keep a track of frequency of each character
        int hash[] = new int[26];
        for (int i = 0; i < B.length(); i++) {
         int val = hash[B.charAt(i) - 'a']++;
            System.out.println(val);
        }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            // if the frequency of a charatcer present in the string isnt divisble by k, set
            // a flag which indicates that
            // it will never be possible to represent S as concatenation of K strings
            if (hash[i] % A != 0)
                flag = 1;
        }
        if (flag == 1)
            return -1;
        else
            return 1;
    }
    public static void main(String[] args) {
        int res = solve1(2, "xxyy");
        System.out.println(res);
    }
}
