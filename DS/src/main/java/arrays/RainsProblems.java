package arrays;

import java.util.Vector;

/**
 * Created by Spandana.K on 03-08-2021.
 */
public class RainsProblems {
    public static int findNoOfUnitsOfRainWaterStorage(Vector<Integer> heights){
        int n = heights.size();
        if (n<=2){
            return 0;
        }
        //Left max and Right max
        Vector<Integer> leftMax = new Vector<>(0);
        Vector<Integer> rightMax = new Vector<>(5);

        //Just add all 0 elements
        for (int i =0; i<n; i++){
            leftMax.add(0);
            rightMax.add(0);
        }

        //Set first and last element to new left and right from heights arr
        leftMax.set(0, heights.get(0));
        rightMax.set(n-1, heights.get(n-1));

        //Find the max element for left and right array
        for (int i = 1; i<n; i++){
            leftMax.set(i, Math.max(leftMax.get(i - 1), heights.get(i)));
            rightMax.set(n-i-1, Math.max(rightMax.get(n-i), heights.get(n-i-1)));
        }

        //Find the water units
        int maxUnitOfWater = 0;
        for (int i = 0; i<n; i++) {
            maxUnitOfWater += Math.min(leftMax.get(i), rightMax.get(i)) - heights.get(i);
        }
        return  maxUnitOfWater;
    }


    public static void main(String[] args) {
        Vector<Integer> input = new Vector<>();
        input.addElement(0);
        input.addElement(1);
        input.addElement(0);
        input.addElement(2);
        input.addElement(1);
        input.addElement(0);
        input.addElement(1);
        input.addElement(3);
        input.addElement(2);
        input.addElement(1);
        input.addElement(2);
        input.addElement(1);

        System.out.println("Input vector: " + input);
        System.out.println("Total waterUnits: " + findNoOfUnitsOfRainWaterStorage(input));
    }
}
