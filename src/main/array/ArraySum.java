package main.array;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {25, 4, 16, 9, 10}; // declare and init the array with given elements
        int sum = 0; // init the sum to 0
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // add each element of the array to the sum
        }
        
        System.out.println("The sum of the array's value is:" + sum);
    }
}