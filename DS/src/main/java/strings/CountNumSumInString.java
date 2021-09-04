package strings;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class CountNumSumInString {
    /* Count number sum in string “a34fd34”.
        Method should calculate number sum in string and return result
        “A34fd34” = 68 ==> A 3 4 f d 3 4
        “Sd+34-4” = 38
        “Dfgfg” = 0*/
    //"A34fd34"

    private static int countSum(String value) {
        int sum = 0;
       /* int number =0;
        StringBuilder stringBuilder = new StringBuilder();
        char[] input = value.toCharArray();*/

        for (int i=0; i<value.length();i++){
            if (Character.isDigit(value.charAt(i))){
                sum+= Character.getNumericValue(value.charAt(i));
            }
        }
        return sum;
    }

    private static int countSumOf(String value) {
        int sum = 0;
        String temp = "0";
        char[] arr = value.toCharArray();
        for (char ch : arr) {
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        // System.out.println(countSum("A34fd34"));
        System.out.println(countSumOf("A34fd34"));
    }
}


