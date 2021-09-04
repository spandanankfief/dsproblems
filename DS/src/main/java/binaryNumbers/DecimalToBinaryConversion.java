package binaryNumbers;

/**
 * Created by Spandana.K on 22-08-2021.
 */
public class DecimalToBinaryConversion {
    public static int numSetBits(int A) {
        int[] resultedBinarySet = new int[35];
        int id = 0;
        int bitOneCountInResult = 0;
        while(A > 0){
            resultedBinarySet[id++] = A % 2;
            A = A/2;
        }

        for(int i = id-1; i>=0; i--)
        {
            System.out.printf(String.valueOf(resultedBinarySet[i]));
            if(resultedBinarySet[i] == 1){
                bitOneCountInResult++;
            }
        }
        System.out.println();
        return bitOneCountInResult;
    }

    public static int singleNumber(final int[] A) {

        int initialXor = A[0];
        for(int i =1; i<A.length; i++){
            initialXor = initialXor ^ A[i]; 
        }
        return initialXor;
    }
    public static void main(String[] args) {

       // System.out.println(numSetBits(125));
        int res = singleNumber(new int []{2, 3, 5, 4, 5, 3, 4});
        System.out.println(res);
    }
}
