package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Spandana.K on 03-09-2022.
 */
public class FindKthMin {

    public static int kthsmallest(final int[] A, int B) {

        for (int i = 0; i < B; i++) {
            int minn = Integer.MAX_VALUE, idx = 0;
            for (int j = i; j < A.length; j++) {
                if (A[j] < minn) {
                    minn = A[j];
                    idx = j;
                }
            }
            int tmp = A[i];
            A[i] = A[idx];
            A[idx] = tmp;
        }
        return A[B - 1];

       /* int firstElement = A.get(0);
        int swapCount = 0;
        int min = 0;

        while(swapCount <= B){
            for(int i = 1 ; i<A.size(); i++){
                min = Math.min(firstElement,A.get(i));
                firstElement = min;
            }
            int index = 1;
            int temp = A.get(0);
            A.add(firstElement,min);
            A.add(index,temp);
            index++;
            swapCount++;
        }
        return A.get(B);*/
    }

    public static int kthsmallestList(final List<Integer> A, int B) {

        List<Integer> res = new ArrayList<Integer>();
        res.addAll(A);

        for(int i = 0; i<B; i++){
            int min = Integer.MAX_VALUE;
            int indexMin = 0;

            for( int j = i; j< A.size(); j++){
                if(A.get(j) < min){
                    min = A.get(j);
                    indexMin = j;
                }
            }

            int temp = A.get(i);
            A.set(i,A.get(indexMin));
            A.set(indexMin, temp);
        }


        return A.get(B-1);
    }
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(8);
        input.add(16);
        input.add(80);
        input.add(55);input.add(32);
        input.add(8);input.add(38);input.add(40);input.add(65);input.add(18);input.add(15);
        input.add(45);input.add(50);input.add(38);input.add(54);
        input.add(52);input.add(23);input.add(74);input.add(81);
        input.add(42);input.add(28);input.add(16);input.add(66);
        input.add(35);input.add(91);input.add(36);input.add(44);
        input.add(9);input.add(85);input.add(58);input.add(59);
        input.add(49);input.add(75);input.add(20);input.add(87);
        input.add(60);input.add(17);input.add(11);input.add(39);
        input.add(62);input.add(20);input.add(17);input.add(46);
        input.add(26);input.add(81);input.add(92);

    int[]  input1 = new int[]{ 8, 16, 80, 55, 32,
            8, 38, 40, 65, 18, 15, 45, 50, 38, 54,
            52, 23, 74, 81, 42, 28, 16, 66, 35, 91,
            36, 44, 9, 85, 58, 59, 49, 75, 20, 87,
            60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92 };

       // System.out.printf("result :" + kthsmallest(input1,9));
        System.out.printf("result :" + kthsmallestList(input,9));
    }
}
