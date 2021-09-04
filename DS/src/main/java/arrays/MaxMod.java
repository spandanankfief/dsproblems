package arrays;

public class MaxMod {

    public static int solve(int[] A) {
        int size = A.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i< size-1; i++){
            if(first < A[i]){
                second = first;
                first = A[i];
            }else if(second < A[i] && first != A[i]){
                second = A[i];
            }
        }
        if(second != Integer.MIN_VALUE){
            return second;
        }
        return second;
    }

    /*public static int solve(int[] A) {
        int mod_max = 0;
        for(int i= 0 ;i<A.length-1;i++){
            for(int j=0;j<A.length-1;j++){
                try{
                    if(mod_max < A[i]% A[j]){
                        mod_max =  A[i]% A[j];
                    }
                }catch(ArithmeticException e){System.out.println(
                        "Divided by zero operation cannot possible");}

            }
        }

        return mod_max;
    }*/
    public static void main(String[] args) {

        System.out.println(solve(new int[]{927, 0, 374, 394, 279, 799, 878, 937, 431, 112 }));
    }
}
