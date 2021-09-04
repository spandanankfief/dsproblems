package vectors;

import java.util.Vector;

/**
 * Created by nkspa on 15-07-2021.
 */
public class FizzBuzz {

    public static Vector<String> res(){
        Vector<String> vector = new Vector<>();
        for (int i =1; i < 20; i++){
            if (i%15 == 0){
                vector.add("fizzbuzz");
            }else if (i%3 == 0){
                vector.add("fiz");
            }else if (i%5==0){
                vector.add("buzz");
            }else {
                vector.add(i+"");
            }
        }
        System.out.println(vector);

        return vector;
    }
    public static void main(String[] args) {
        res();
        int i = 10;
        Vector<Integer> A[];
    }
}
