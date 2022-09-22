package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Spandana.K on 03-09-2022.
 */
public class SortByColor {

    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        // 0, 1, 2,0,1,2
/*
        int count0 =0, count1=0, count2 =0;
        for (int i =0; i<A.size(); i++){
            if (A.get(i) == 0){
                count0++;
            }else if (A.get(i) == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        for (int i =0; i<A.size(); i++){
            while (count0 >= 0){
                A.set(i,0);
                count0--;
            }
            while (count1 >= 0){
                A.set(i,1);
                count1--;
            }
            while (count2 >= 0){
                A.set(i,2);
                count2--;
            }

        }
        return A;*/

        int zero = 0;
        int two = A.size() - 1;

        for (int i = 0; i <= two;) {
            if (A.get(i) == 0) {
                int temp = A.get(zero);
                A.set(zero, 0);
                A.set(i, temp);
                zero++;
                i++;
            } else if (A.get(i) == 2) {
                int temp = A.get(two);
                A.set(two, 2);
                A.set(i, temp);
                two--;
            } else {
                i++;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        // 0, 1, 2,0,1,2
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        input.add(0); input.add(1); input.add(2); input.add(0); input.add(1); input.add(2);
        res = sortColors(input);
        for (int i = 0; i < input.size(); i++)
            System.out.print(res.get(i) + " ");

    }
}
