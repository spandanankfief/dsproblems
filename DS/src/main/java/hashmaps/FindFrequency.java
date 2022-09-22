package hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Spandana.K on 26-08-2022.
 */
public class FindFrequency {

    public static void  FindFrequency(int[] A){
        HashMap<Integer,Integer> resMap = new HashMap<>();

        for (int i=0; i<A.length;i++){
            if (resMap.containsKey(A[i])){
                resMap.put(A[i],resMap.get(A[i])+1);
                resMap.containsValue(0);
            }else {
             resMap.put(A[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : resMap.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        FindFrequency(new int[] {1,3,7,6,2,1,8,7});
    }
}
