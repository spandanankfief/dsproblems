package strings;

import java.util.*;


public class StringsExamples {

    public static void countChars(String input){
        HashMap<Character,Integer> charCount = new HashMap<>();
        char[] arr = input.toCharArray();
        for (char ch: arr) {
            if (charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch)+1);
            }else {
                charCount.put(ch,1);
            }
        }
        for (Map.Entry entry : charCount.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void java8Count (String input){
        char search = 'a';
        long count = input.chars().filter(ch -> ch ==search ).count();
        System.out.println("JAVA 8- "+search +":"+ count);
    }

    public static Set<String> findDuplicateWords(String inputStr){
        //java and javas are diff and java and javas are not same
        // java and javas are

        if (inputStr == null || inputStr.isEmpty()){
            return  Collections.emptySet();
        }

        Set<String> resSet = new HashSet<>(); // to store result set
        String[] inputArr = inputStr.split(" ");
        Set<String> inputSet = new HashSet<>(); // to compute duplicates

        for (String str: inputArr) {
            if (!inputSet.add(str)){
                resSet.add(str);
            }
        }
        return resSet;
    }


    public static void findDuplicateWordsInArrListWithCollection(){
        List<String> duplicateList = Arrays.asList("aa","aaa","aa","cc","bb","dd");
        //List<String> duplicateList = Arrays.asList("Android" , "Android", "iOS", "Windows mobile");
        HashSet<String> withoutDup = new HashSet<>(duplicateList);
        LinkedHashSet<String> withoutdupHaset = new LinkedHashSet<>(duplicateList);
        System.out.println(withoutDup);
        System.out.println(withoutdupHaset);
    }

    public static double[]  findSubarrSum(int[] input, int k){
        //create res arr
        //
        double[] res = new double[input.length - k + 1];
        double sum=0;
        int start = 0;
        for (int end = 0; end < input.length ; end++)
        {
            sum += input[end];
            if (end >= k-1){
                res[start] = sum/k;
                sum -= input[start];
                start++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String input = "spandana";
        //countChars(input);

        //java8Count(input);

        /*Set<String> duplicates = findDuplicateWords("java and javas are diff and java and javas are not same");
        System.out.println(duplicates);*/
        //findDuplicateWordsInArrListWithCollection();

        double[] subarrSum = findSubarrSum(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        System.out.println(Arrays.toString(subarrSum));

    }
}


