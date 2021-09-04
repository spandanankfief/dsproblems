package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Spandana.K on 24-07-2021.
 */

/*
Java arraycopy() method
Without using arraycopy() method
Java Collections
Java Stream API
*/
public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] str1 = {"a","b","c","d"};
        String[] str2 = {"x","y","z","q"};
        String[] res = new String[str1.length + str2.length];

        //1. arrayCopy
       /* System.arraycopy(str1,0,res,0,str1.length);
        System.arraycopy(str2,0,res,str1.length,str2.length);
        System.out.println(Arrays.toString(res));*/

        //2. Java Collections
       /* List list = new ArrayList(Arrays.asList(str1));
        list.addAll(Arrays.asList(str2));
        System.out.println("Final list " +list.toString());*/

        //3. Java Streams api
        /*Object[] result = Stream.of(str1,str2).flatMap(Stream::of).toArray();
        System.out.println(Arrays.toString(result));*/

        ArrayList arrayList1 = new ArrayList(Arrays.asList(str1));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(str2));

        List resArr = Stream.of(arrayList1,arrayList2).flatMap(Stream:: of).collect(Collectors.toList()); //[[a, b, c, d], [x, y, z, q]]

        System.out.println(resArr);





    }
}
