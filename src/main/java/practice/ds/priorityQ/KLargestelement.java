package practice.ds.priorityQ;

import java.util.PriorityQueue;

public class KLargestelement {
    public static void main(String[] args) {
        kLargestElement();
        kthLargest(3);
    }

    private static void kthLargest(int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] array = {2, 3, 5, 90, 3, 5, 8, 10, 11, 17};

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (pq.size() < k) {
                pq.add(number);
            } else {
                if (pq.peek() < number) {
                    pq.poll();
                    pq.add(number);
                }
            }
        }
         System.out.println(k +"th largest element is: "+pq.poll());
    }

    private static void kLargestElement() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] array = {2, 3, 5, 90, 3, 5, 8, 10, 11, 17};

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (pq.size() < 3) {
                pq.add(number);
            } else {
                if (pq.peek() < number) {
                    pq.poll();
                    pq.add(number);
                }
            }
        }
        while (pq.size() != 0) {
            System.out.println(pq.poll());
        }
    }
}
