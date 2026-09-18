package LeetCode;

import java.util.Stack;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(120));
        System.out.println(reverse(123));
        System.out.println(reverse(-123));

    }

    public static int reverse(int x){
        int MIN_VALUE = (int) Math.pow(-2, 31);
        int MAX_VALUE = (int) Math.pow(2, 31) -1;


        String numberToString = Integer.toString(x);
        Stack<String> pilaNumeros = new Stack<>();

        for (int i = 0; i < numberToString.length(); i++) {
            pilaNumeros.push(String.valueOf(numberToString.charAt(i)));
        }

        String reversedString = "";
        boolean anadirMenos = false;
        while (!pilaNumeros.empty()){
            String valorStack = pilaNumeros.pop();
            if(valorStack.equalsIgnoreCase("-")){
                anadirMenos = true;
                continue;
            }
            reversedString += valorStack;
        }

        if(anadirMenos){
            reversedString = "-" + reversedString;
        }


        long parsedLong = Long.parseLong(reversedString);


        if(parsedLong > MAX_VALUE || parsedLong < MIN_VALUE){
            return 0;
        }

        return (int) parsedLong;

    }


}
