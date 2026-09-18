package ExercisesDataStructures.LinkedListsExercises;


public class MyNode {

    private int data;
    private MyNode next;

    public MyNode(int data){
        this.data = data;
        this.next = null;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    public static void main(String[] args) {
        MyNode node = new MyNode(10);
        MyNode node2 = new MyNode(20);
        MyNode node3 = new MyNode(30);
        node.next = node2;
        node2.next = node3;

        MyNode current = node;

        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }




    }

}




