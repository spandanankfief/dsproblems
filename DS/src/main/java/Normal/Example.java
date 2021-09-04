package Normal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long totalAccountBalance = sc.nextLong();
        int noOfOperations = sc.nextInt();

        int len = noOfOperations * 2;
        long [] a = new long[len];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<len; i++ ) {
            a[i] = sc.nextLong();
        }
        System.out.println(Arrays.toString(a));

        for(int i=0; i < a.length; i++){
            if(a[i] == 1){
                totalAccountBalance = totalAccountBalance + a[i+1];
                System.out.println(totalAccountBalance);
                i++;
            }  else if(a[i] == 2){
                if(totalAccountBalance > a[i+1]){
                    totalAccountBalance =  totalAccountBalance - a[i+1];
                    System.out.println(totalAccountBalance);
                    i++;
                }else{
                    System.out.println("Insufficient Funds");
                }
            }

        }
    }
}
