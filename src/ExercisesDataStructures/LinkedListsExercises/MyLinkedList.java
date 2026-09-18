package ExercisesDataStructures.LinkedListsExercises;

public class MyLinkedList {

    private MyNode head;


    public MyLinkedList(){
        this.head = null;
    }


    public MyLinkedList(MyNode head){
        this.head = head;
    }



    public void add(int number){


        MyNode nodoAnadir = new MyNode(number);

        if(this.head == null){
            this.head = nodoAnadir;
            return;
        }

        MyNode current = this.head;
        MyNode last = null;

        while (current != null){
            last = current;
            current = current.getNext();

        }

        last.setNext(nodoAnadir);

    }


    public int size(){

        MyNode current = this.head;

        int contador = 0;


        while (current != null){
            contador += 1;
            current = current.getNext();
        }


        return contador;

    }


    public boolean contains(int number){

        MyNode current = this.head;

        boolean isContained = false;


        while (current != null){

            if(number == current.getData()){
                isContained = true;
                break;
            }

            current = current.getNext();

        }

        return isContained;


    }

    public Integer get(int index){

        MyNode current = this.head;

        int contadorDeRepeticiones = 0;

        while (current != null && contadorDeRepeticiones <= index){
            if(contadorDeRepeticiones == index){
                return current.getData();
            }

            current = current.getNext();
            contadorDeRepeticiones++;
        }


        return null;



    }

    public boolean remove(int number){

        MyNode current = this.head;
        MyNode previous = null;


        while (current != null){
            if(current.getData() == number){
                if(previous == null && current.getNext() == null){
                    this.head = null;
                }

                if(previous == null && current.getNext() != null){
                    this.head = current.getNext();
                }

                if(previous != null){
                    previous.setNext(current.getNext());
                }

                return true;
            }

            previous = current;
            current = current.getNext();

        }

        return false;

    }



    public static void main(String[] args) {
        MyNode miNodo1 = new MyNode(10);

        MyLinkedList linkedList = new MyLinkedList(miNodo1);



        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(3);


        MyNode current = linkedList.head;

        while (current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }


        System.out.println("El tamaño es " + linkedList.size());


        System.out.println(linkedList.get(2));

        System.out.println(linkedList.remove(3));
    }

}
