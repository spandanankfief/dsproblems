package strings;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class FindDigitsAndSpacesInStr {

    public static void main(String[] args) {
        String str = "hello 5 world";
        int digitsPresentCount = 0;
        int spacePresentCount = 0;
        int alphabetPresentCount = 0;

       char arr[] = str.toCharArray();

        for (char ch : arr) {
            if (ch >= '0' && ch<='9'){
                digitsPresentCount++;
            }else if (ch == ' '){
                spacePresentCount++;
            }else if (ch >='a' && ch <= 'z' || ch >='A' && ch <= 'Z'){
                alphabetPresentCount++;
            }
        }

        System.out.println("Digits count:" + digitsPresentCount + " Space counts:" + spacePresentCount +
                " Alphabet count:" + alphabetPresentCount);
    }
}
