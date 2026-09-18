package SortAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        
        // selection sort = search through an array and keep track of the minimum value during
        //     each iteration. At the end of each iteration, we swap variables.

        //     Quadratic time O(n^2)
        //     small data set = okay
        //     large data set = BAD

        int[] array = {8, 7, 9 , 2, 3, 1, 5, 4, 6};

        selectionSort(array);
        
        
        for (int i: array){
            System.out.println(i);
        }




    }

    private static void selectionSort(int[] array) {
        int temp;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];

            System.out.println("LA VARIABLE TEMPORAL ES: " + min);
            for (int j = i; j < array.length - 1; j++) {
                System.out.println(array[j + 1]);
                if(min > array[j + 1]){
                    min = array[j + 1];
                    index = j + 1;
                    System.out.println("LA VARIABLE TEMPORAL HA CAMBIADO A : " + min);

                }


            }
            temp = array[i];

            array[i] = min;

            array[index] = temp;

        }
        
    }

    private static void selectionSort2(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }


}
