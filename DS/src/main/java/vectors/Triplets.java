package vectors;

import java.util.Vector;

/**
 * Created by nkspa on 15-07-2021.
 */
public class Triplets {
    public static Vector<Vector<Integer>> findTriplets(Vector<Integer> inputArr, int targetSum){
        Vector<Integer> res1 = null ;
        Vector<Vector<Integer>> res = new Vector<>();
        for (int i = 0; i<= inputArr.size()-3; i++)
        {
            int j = i+1;
            int k = inputArr.size()-1;

            while (j<k){
                int currSUm = inputArr.get(i);
                currSUm += inputArr.get(j);
                currSUm += inputArr.get(k);

                if (currSUm == targetSum){
                    res1 = new Vector<>();
                    res1.addElement(inputArr.get(i));
                    res1.addElement(inputArr.get(j));
                    res1.addElement(inputArr.get(k));
                    res.addElement(res1);
                    j++;
                    k--;
                }else if(currSUm > targetSum){
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Vector<Integer> input = new Vector<>();
        input.addElement(1);
        input.addElement(2);
        input.addElement(3);
        input.addElement(4);
        input.addElement(5);
        input.addElement(6);
        input.addElement(7);
        input.addElement(8);
        input.addElement(9);
        input.addElement(15);

        System.out.println("Input vector: " + input);
        Vector<Vector<Integer>> arr = findTriplets(input,18);

        for(int i=0;i< arr.size(); i++){
            for(int number : arr.get(i)){
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }
}
