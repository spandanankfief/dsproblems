package arrays;

/**
 * Created by Spandana.K on 02-08-2021.
 */
public class PrintAllSubArrays {

    public static int printAllSubArrays(int[] arr, int n) {
        int largestSum =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.printf("("+ i + "," + j + ")");
                for (int k = i; k <=j; k++) {
                    System.out.printf(arr[k] + ",");
                }
                System.out.printf("\n");
            }
        }
        return  largestSum;
    }

    public static int printLargestSumOfSubArrays(int[] arr, int n) {
        int largestSum =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currSum = 0;
                //System.out.printf("("+ i + "," + j + ")");
                for (int k = i; k <=j; k++) {
                    currSum+= arr[k];
                }
                if (currSum >largestSum){
                    largestSum = Math.max(largestSum,currSum);
                }
            }
        }
        return  largestSum;
    }

    public static int KadanesAlgo(int[] arr, int n) {
        int currSum = 0;
        int largestSum = 0;
        for(int i=0; i<n; i++){
            currSum+= arr[i];
            if (currSum < 0){ // reset if sum goes negative
                currSum = 0;
            }
            largestSum = Math.max(largestSum,currSum);
        }
        return  largestSum;
    }

    public static void main (String[]args){
        int[] arr = new int[]{-2,3,4,-1,5,-12,6,1,3};
      //  System.out.println("printAllSubArrays : "+printAllSubArrays(arr, arr.length));
       // System.out.println("printLargestSumOfSubArrays : "+printLargestSumOfSubArrays(arr, arr.length));
        System.out.println("KadanesAlgo : "+KadanesAlgo(arr, arr.length));
    }

}
