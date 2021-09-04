package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class FrequencyOfElementsInArray {
    //O(n2)
    public static void findFrequencyOfElement(int[] arr,int size){
        boolean[] visited = new boolean[size];
        Arrays.fill(visited,false);

        for (int i=0; i<size; i++){
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j=i+1; j<size; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + ":" + count);
        }
    }

    //O(n)
    public static void findFrequencyOfElementInON(int[] arr,int size){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<size; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else
            {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> val: map.entrySet()) {
            System.out.println(val.getKey() + ":" + val.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        findFrequencyOfElement(arr,arr.length);
        System.out.println("-----");
        findFrequencyOfElementInON(arr,arr.length);
    }
}
