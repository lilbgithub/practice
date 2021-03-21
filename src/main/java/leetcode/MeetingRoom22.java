package leetcode;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class MeetingRoom22 {

    public static void main(String[] args) {
        int[][] arr = {{0,4}, {1,3},{3,4},{2,3}};
       int result = mettingRoom2(arr);

       System.out.println(result);
    }

    private static int mettingRoom2(int[][] arr) {
        //check input
        if(arr == null || arr.length == 0){
            return 0 ;
        }

        //sort based on start time
        Arrays.sort(arr, Comparator.comparing(i -> i[0]));

        //build structure based on min heap
        PriorityQueue<int[]> minHeap =  new PriorityQueue<>(Comparator.comparing(i->i[1]));

        int[] prev = arr[0];
        minHeap.add(prev);
        for(int i=1; i< arr.length; i++) {
            //check if overlap , add new room
            int[] current = arr[i];
             if(current[0] < prev[1]){
                 minHeap.add(current);
             }else {            //else,use or replace same room
                 int[] interval = minHeap.poll();
               //  interval[1] = current[1];
                 minHeap.add(current);
             }
            prev = current;
        }
        return minHeap.size();
    }
}
