package strings;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class CharExample {
    public static void main(String[] args) {
        char ar[] = {'a','b','c','d','e','f','g'};
        System.out.println(ar);
        System.out.println(ar.length);
        System.out.println();

        String str = "spandana";
        System.out.println(str);
        String s = String.copyValueOf(ar);
        str = str.concat("abhi");
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("Hi");
        stringBuilder.append(true);
        System.out.println(stringBuilder);
        stringBuilder.append(1);
        System.out.println(stringBuilder);

        System.out.println(str.compareTo(stringBuilder.toString()));
    }
}
