package ExercisesDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueueSystem {

    private Queue<String> queue;


    public PrintQueueSystem(Queue<String> queue) {
        this.queue = queue;
    }

    public void addDocument(String docName){
        queue.offer(docName);
    }

    public String printNextDocument(){
        if(queue.isEmpty()){
            return "No hay documentos pendientes";
        }
        return queue.poll();
    }

    public String peekNextDocument(){
        if(queue.isEmpty()){
            return "No hay documentos pendientes";
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        PrintQueueSystem myPrintQueueSystem = new PrintQueueSystem(new LinkedList<String>());
        myPrintQueueSystem.addDocument("Alvaro");
        myPrintQueueSystem.addDocument("Alvaro 2");
        myPrintQueueSystem.addDocument("Alvaro 3");
        myPrintQueueSystem.addDocument("Alvaro 4");
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.peekNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());
        System.out.println(myPrintQueueSystem.printNextDocument());

    }





}


