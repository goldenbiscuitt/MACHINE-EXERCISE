package main.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        // Create a stack of strings
        Stack<String> stack = new Stack<String>();

        // Push three elements onto the stack
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        // Pop the pushed elements and print them using LIFO order
        while (!stack.isEmpty()) {
            String popped = stack.pop();
            System.out.println(popped);
        }

        // Check if the stack is empty
        System.out.println(stack.isEmpty()); // should return true
    }
}