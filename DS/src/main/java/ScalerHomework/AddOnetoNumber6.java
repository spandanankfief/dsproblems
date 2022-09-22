package ScalerHomework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Spandana.K on 20-09-2022.
 */
public class AddOnetoNumber6 {
    public static int[] plusOne(int[] A) {
        long res = 0;
        String str = "";

        for (int i =0; i< A.length; i++){
            str += A[i];
        }

        res = Long.parseLong(str)+1;
        String temp = Long.toString(res);
        int[] result = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            result[i] = temp.charAt(i) - '0';
        }

        return result;
    }

    public static ArrayList<Integer> plusOne1(ArrayList<Integer> A) {
        int pos=A.size()-1;

        for(int i=pos;i>=0;i--){
            if(A.get(i)==9){
                A.set(i,0);
                pos--;
            }
            else{
                A.set(i,A.get(i)+1);
                break;
            }
        }

        if(pos==-1)
            A.add(0,1);
        while(A.get(0)==0){
            A.remove(0);
        }
        return A;
    }
    public static void main(String[] args) {
       /* int[] arr = new int[]{1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5  };
        int[] res = plusOne(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }*/

        ArrayList<Integer> resultArr = new ArrayList<Integer>(Arrays.asList(9,9,9,9 ));
        System.out.println(plusOne1(resultArr));
    }
}
