package main.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // create a linked list with elements "apple", "banana", and "cherry"
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        
        // print the list
        System.out.println("Original ListL: " + fruits);
        
        // add "orange" to the beginning of the list
        fruits.addFirst("orange");
        
        // print the list after adding "orange"
        System.out.println("List after adding 'orange': " + fruits);
        
        // remove an element from the list
        fruits.remove(2);
        
        // print the list after removing an element
        System.out.println("List afte removing an element: " + fruits);
        
        // get an element at a specific index
        String element = fruits.get(1);
        System.out.println("Element at index 1:" + element);
        
        // print the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);
    }
}
