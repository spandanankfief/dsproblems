package arrays;

import java.util.Scanner;

/**
 * Created by Spandana.K on 05-09-2021.
 */
public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfArr = sc.nextInt();

        int[] a = new int[lengthOfArr];
        for(int i=0; i<lengthOfArr; i++ ) {
            a[i] = sc.nextInt();
        }

        int noOfRotations = sc.nextInt();

        String resArr[] = new String[lengthOfArr];

        for(int i=0; i<lengthOfArr; i++){
            int newIndex = (i+noOfRotations) % lengthOfArr;
            resArr[newIndex] = String.valueOf(a[i]);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : resArr){
            stringBuffer.append(str).append(" ");
        }
        String res = stringBuffer.toString();
        System.out.println(res);
    }
}
