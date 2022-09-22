package strings;

/**
 * Created by Spandana.K on 06-09-2022.
 */
public class Columns {
    public static int solve(String a){
        //ABA =12
        int A = 123;
        String b = Integer.toString(A);
        System.out.printf(b);
        a.length();
        int n = a.length();
        int getAscii = 0;
        int result = 0;
        int power = 1;
        int pos;
        for (int i = n-1 ;i >=0; i--) {
            getAscii  = a.charAt(i);
            pos = getAscii - 64;
            result = result + pos * power;
            power = power * 26;

        }
        return result;
    }

    public static int isPalindrome(int A) {
        String a = Integer.toString(A);
        int start = 0;
        int end = a.length() -1;
        while(start <= end){
            if (a.charAt(start) == a.charAt(end)){
                start++;
                end--;
            }else{
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
      /*  int res = solve("AA");
        System.out.printf("result :" +res);*/
        int res = isPalindrome(2147447412);
        System.out.print(res);
    }
}
