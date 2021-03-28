package practice.ds.priorityQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int[] array ={9,10,5,6,2};

        for(int i=0; i< array.length; i++){
            priorityQueue.add(array[i]);
        }

        while (priorityQueue.size() > 0){
            System.out.println(priorityQueue.poll());
        }
    }
}
