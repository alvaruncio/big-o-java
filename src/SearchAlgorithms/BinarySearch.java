package SearchAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        // binary search = Search algorithm that finds the position
        //				   of a target value within a SORTED array.
        //				   Half of the array is eliminated during each "step"

        int[] array = new int[1_000_000];

        int target = 777_777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        //int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);



        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + index);
        }





    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];


            System.out.println(value);
            
            if(value == target){
                return middle;
            } else if (value > target) {
                high = middle - 1;
            }else{
                low = middle + 1;
            }
        }

        return -1;
    }


    public static int binarySearch2(int[] array, int numberToFound){
        int low = 0;
        int high = array.length;

        while (low <= high){
            int middleIndex = low + (high - low) / 2;
            int middleValue = array[middleIndex];

            if(middleValue == numberToFound){
                return middleIndex;
            } else if (middleValue > numberToFound) {
                high = middleIndex - 1;
            }else{
                low = middleValue + 1;
            }
        }
        return  -1;
    }

}
