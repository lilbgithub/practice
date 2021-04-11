package practice.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]){
        int[]  number =  { 2,3,7,4,8};
        int target = 12 ;
        int[] result = getTwoSum(number, target);
        System.out.println(result[0]+" "+ result[1]);
    }
    public static int[] getTwoSum(int[]  numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for(int i=0; i< numbers.length; i++){
            int delta = target - numbers[i];
            if( visitedNumbers.containsKey(delta)){
             return new int[] {visitedNumbers.get(delta),i};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[]{-1,-1};
    }
}
