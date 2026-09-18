package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStructure {
    public static void main(String[] args) {

        // *******************************************************

        // Queue = FIFO data structure. First-In First-Out (ex. A line of people)
        //                A collection designed for holding elements prior to processing
        //                Linear data structure

        //      enqueue = offer() Añade un nuevo elemento a la cola
        //      dequeue = poll() Elimina el elemento que esta primero de la cola


        Queue<String>  queue = new LinkedList<String>();


        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        System.out.println(queue.peek()); // Devuelve el valor que esta primero en la cola(quien esta en la cabeza)

        queue.poll(); // Elimina el elemento de la cola, en este caso Karen
        queue.poll(); // Elimina a Chad


        System.out.println(queue);



        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        // *******************************************************


    }



}
