package DataStructures;

import java.util.ArrayList;

public class DynamicArraysStructure {

    public static class DynamicArray{
        int size;
        int capacity = 10;
        Object[] array;

        public DynamicArray(){
            this.array = new Object[capacity];
        }


        public DynamicArray(int capacity){
            this.capacity = capacity;
            this.array= new Object[this.capacity];
        }

        public void add(Object data){

            if(this.size >= this.capacity){
                grow();
            }

            array[this.size] = data;
            this.size++;


        }

        public void insert(int index, Object data){
            if(this.size >= this.capacity){
                grow();
            }

            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = data;
            size++;

        }

        public void delete(Object data){
            for (int i = 0; i < size; i++) {
                if(array[i] == data){
                    for (int j = 0; j < (size - i - 1); j++) {
                        array[i + j] = array[i + j + 1];
                    }
                    array[size - 1] = null;
                    size--;
                    if(this.size <= (capacity / 3)){
                        shrink();
                    }
                }
            }
        }

        public int search(Object data){

            for (int i = 0; i < size; i++) {
                if(array[i] == data){
                    return i;
                }
            }
            return -1;
        }

        private void grow(){
            int newCapacity = (int) (capacity * 1.5);
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }

        private void shrink(){
            int newCapacity = (int) (capacity / 1.5);
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }



        public boolean isEmpty(){
            return this.size == 0;
        }

        public String toString(){
            String arrayString = "";
            for (int i = 0; i < this.size; i++) {
                arrayString += this.array[i] + ", ";
            }

            if(!arrayString.equalsIgnoreCase("")){
                arrayString =  "[" + arrayString.substring(0, arrayString.length() - 2) + "]";
            }else{
                arrayString = "[]";
            }

            return arrayString;
        }



    }




    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());


    }
}
