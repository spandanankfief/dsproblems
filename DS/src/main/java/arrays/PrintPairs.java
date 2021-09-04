package arrays;

/**
 * Created by Spandana.K on 02-08-2021.
 */
public class PrintPairs {
    public static void printPairs(int[] arr, int n){
        int secondNumber = 0;
        for (int i =0; i< n ; i ++){
         int firstNumber = arr[i];
         for (int j=i+1; j<n; j++){
              secondNumber = arr[j];
             System.out.println(firstNumber + "," +secondNumber );
         }

        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6,8};
        printPairs(arr, arr.length);
    }
}
