package SortAlgorithms;

public class Recursion {
    public static void main(String[] args) {
        // recursion = When a thing is defined in terms of itself. - Wikipedia
        //			   Apply the result of a procedure, to a procedure.
        //			   A recursive method calls itself. Can be a substitute for iteration.
        //			   Divide a problem into sub-problems of the same type as the original.
        //			   Commonly used with advanced sorting algorithms and navigating trees

        //			   Advantages
        //			   ----------
        //			   easier to read/write
        //			   easier to debug

        //			   Disadvantages
        //			   ----------
        //			   sometimes slower
        //			   uses more memory


        walkRecursive(5);

        System.out.println(factorial(7));

        power(2, 8);

        System.out.println(countVowels("murcielago"));

        System.out.println(reverse("hola"));
        System.out.println(reverse("java"));
        System.out.println(reverse("murcielago"));

        System.out.println(countOccurrences("banana", 'a'));;
        System.out.println(countOccurrences("hello", 'l'));;
        System.out.println(countOccurrences("java", 'z'));;

        System.out.println(isPalindrome("ana"));

        System.out.println(sumDigits(1234));

    }

    private static int power(int base, int exponent) {
        if(exponent < 1)
            return 1;
        return base*power(base, exponent-1);
    }

    private static void walk(int steps){
        for (int i = 1; i < steps; i++) {
            System.out.println("You take a step!");
        }
    }

    private static void walkRecursive(int steps){
        if(steps < 1){ // Base case
            return;
        }

        System.out.println("You take a step!");
        walkRecursive(steps - 1); // Recursive case
    }

    private static int factorial(int number){

        if(number < 1){
            return 1;
        }

        return  number * factorial(number - 1);



    }

    private static int sum(int number){
        if(number < 1){
            return 0;
        }

        return number + sum(number - 1);
    }

    private static int countVowels(String word){
        if(word.isEmpty()){
            return 0;
        }

        char wordChar = word.charAt(0);

        if(wordChar == 'a' || wordChar == 'e' || wordChar == 'i' ||  wordChar == 'o' || wordChar == 'u'){
            return 1 + countVowels(word.substring(1));
        }else {
            return countVowels(word.substring(1));
        }



    }

    private static String reverse(String word){
        if(word.isEmpty()){
            return "";
        }
        char wordChar = word.charAt(0);
        return reverse(word.substring(1)) + wordChar;
    }

    private static int countOccurrences(String word, char target){
        if(word.isEmpty()){
            return 0;
        }

        char wordChar = word.charAt(0);

        if(wordChar == target){
            return 1 + countOccurrences(word.substring(1), target);
        }else{
            return countOccurrences(word.substring(1), target);
        }

    }

    private static boolean isPalindrome(String word){
        if(word.isEmpty() || word.length() == 1){
            return true;
        }


        char wordChartAtFirstPosition = word.charAt(0);
        char wordChartAtLastPosition = word.charAt(word.length() - 1);

        if(wordChartAtFirstPosition != wordChartAtLastPosition){
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));

    }

    private static int sumDigits(int number){
        if (Integer.toString(number).length() == 1) {
            return number;
        }

        return Character.getNumericValue(Integer.toString(number).charAt(0)) + sumDigits(Integer.parseInt(Integer.toString(number).substring(1)));


    }

}
