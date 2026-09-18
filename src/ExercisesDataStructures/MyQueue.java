package ExercisesDataStructures;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {}

    public MyQueue(Stack<Integer> stack1, Stack<Integer> stack2) {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    public void push(int x){
        stack1.push(x);
    }

    public int pop(){
        if(!stack2.empty()){
            return stack2.pop();
        }

        while(!stack1.empty()){
            int valorStack = stack1.pop();
            stack2.push(valorStack);
        }

        return stack2.pop();
    }

    public int peek(){
        if(!stack2.empty()){
            return stack2.peek();
        }

        while(!stack1.empty()){
            int valorStack = stack1.pop();
            stack2.push(valorStack);
        }

        return stack2.peek();
    }

    public boolean empty(){
        return stack1.empty() && stack2.empty();
    }

}
