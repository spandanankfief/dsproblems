package strings;

import java.util.Scanner;

/**
 * Created by Spandana.K on 04-08-2021.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        int startIndex = 0;
        int endIndex = inputStr.length() - 1;

        while (startIndex < endIndex) {
            if (inputStr.charAt(startIndex) == inputStr.charAt(endIndex)) {
                System.out.println("true");
                startIndex++;
                endIndex--;
            }else {
                System.out.println("false");
            }
        }

    }
}
