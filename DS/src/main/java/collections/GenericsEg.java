package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Spandana.K on 17-07-2021.
 */
public class GenericsEg {

    public static <T> List<T> reverseList(List<T> inputList){
    List<T> reversedList = new ArrayList<T>(inputList);
        Collections.reverse(reversedList);
        return reversedList;
    }
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello","world");
        List<Integer> integerList = Arrays.asList(1,2);
        System.out.println(reverseList(stringList));
        System.out.println(reverseList(integerList));
    }
}
