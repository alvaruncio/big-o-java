package DataStructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueStructure {
    public static void main(String[] args) {
        // Priority Queue = A FIFO data structure that serves elements
        //                  with the highest priorities first
        //                  before elements with lower priority

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(1.5);
        queue.offer(2.0);


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }


        Queue<String> queueString = new PriorityQueue<>();

        queueString.offer("B");
        queueString.offer("C");
        queueString.offer("A");
        queueString.offer("F");


        while (!queueString.isEmpty()){
            System.out.println(queueString.poll());
        }
    }
}
