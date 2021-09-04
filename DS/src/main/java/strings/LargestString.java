package strings;

import java.util.Scanner;

/**
 * Created by Spandana.K on 04-08-2021.
 */
public class LargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfInputStrings = sc.nextInt();
        sc.next(); // to consume new line character
        String largestSentence = null;
        int largest_sentence = 0;

        while (noOfInputStrings > 0){
            String inputStr = sc.nextLine();
            int len = inputStr.length();
            if (len > largest_sentence){
                largest_sentence = len;
                largestSentence = inputStr;
            }
            noOfInputStrings--;
        }
        System.out.println("Largest sentence: "+largestSentence);
    }
}
