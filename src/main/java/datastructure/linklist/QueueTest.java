package datastructure.linklist;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        queue1();

    }
    public static void queue1(){
        Queue<Integer>  queue = new ArrayDeque<>();
        queue.add(10);
        System.out.println(queue);
        queue.add(20);
        System.out.println(queue);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }


}
