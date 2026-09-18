package DataStructures;

import java.util.Stack;

public class StackStructure {
    public static void main(String[] args) {
        //stack = LIFO data structure. LAST-IN FIRST-OUT
        //  stores objects into a sort of "vertical tower"
        //  push() to add to the top
        //  pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty()); // ESTA VACIO O NO

        stack.push("Fallout"); // AÑADE ELEMENTO AL  STACK
        stack.push("Borderlands");
        stack.push("Bangalore");
        stack.push("Bangalore 2");

        System.out.println(stack);

        stack.pop(); // BORRA ELEMENTO DEL STACK, EL PRIMERO DE LA PILA, EL QUE ESTA MAS ARRIBA
        String juegoEliminado =  stack.pop();
        System.out.println(juegoEliminado);

        System.out.println(stack.peek()); // VER ELEMENTO MAS ARRIBA DEL STACK SIN ELIMINARLO

        System.out.println(stack.search("Bangalore")); // BUSCA SI EL ELEMENTO SE ENCUENTRA EN EL STACK Y DEVUELVE LA POSICION DEL MISMO DENTRO DE ESTE, SI NO DEVUELVE -1

        // USOS DE LA ESTRUCTURA DE DATOS 'STACK'
        // 1. Hacer/deshacer cosas en un editor de texto(Control Z)
        // 2. Moverse hacia delante/atras en el historial de navegacion
        // 3. Algoritmos de backtracking(laberintos, directorios de ficheros)
        // 4. Call Stack(llamada de funciones)

        System.out.println(isValid("{[]}"));
        System.out.println(reverseString("Alvaro"));

    }


    public static boolean isValid(String s){

        boolean valido = false;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.empty()){
                    return valido;
                }


                switch (c){
                    case ')':
                        if(stack.peek() == '('){
                            stack.pop();
                            break;
                        }else{
                            return valido;
                        }
                    case ']':
                        if(stack.peek() == '['){
                            stack.pop();
                            break;
                        }else{
                            return  valido;
                        }
                    case '}':
                        if(stack.peek() == '{'){
                            stack.pop();
                            break;
                        }else {
                            return valido;
                        }
                }
            }
        }
        return stack.empty();
    }

    public static StringBuilder reverseString(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i <= s.length() - 1; i++){
            char c = s.charAt(i);
            stack.push(c);
        }

        StringBuilder stringReversed = new StringBuilder();
        while (!stack.empty()){
            Character characterStack = stack.pop();
            System.out.println(characterStack);
            stringReversed.append(characterStack);
        }



        return stringReversed;
    }
}
