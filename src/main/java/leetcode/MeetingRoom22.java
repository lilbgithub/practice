package leetcode;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MeetingRoom22 {

    public static void main(String[] args) {
        int[][] arr = {{0,1}, {1,3},{2,4}};

        Stack<int[]> stack =  new Stack<>();
        Arrays.sort(arr, Comparator.comparing(element ->element[0]));

        int[] prev =  arr[0];
        stack.push(prev);
         for(int i=1; i< arr.length; i++){
             int[] current =  arr[i];
             if(prev[1] > current[0]){
                 stack.push(current);
             }else {
                 stack.pop();
                 prev[1] = current[1];
                 stack.push(prev);
             }
        }
        System.out.println("Number of rooms :"+ stack.size());

    }
}
