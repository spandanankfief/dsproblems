package algorithms;

/**
 * Created by Spandana.K on 28-07-2021.
 */
public class LinearSearch {
    public static int linerSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
      public static void main(String[] args) {
        int[] arr = {1,5,3,9,7,6};
       int n =  linerSearch(arr,6);
        if (n!=-1){
            System.out.println("Element found " );
        }else {
            System.out.println("Element not found");
        }
    }
}
