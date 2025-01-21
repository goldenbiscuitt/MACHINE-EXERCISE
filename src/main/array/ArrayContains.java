package main.array;

public class ArrayContains {
    public static void main(String[] args) {
        int[] arr = {3, 7, 13, 6, 18}; // declare and initialize the array with five elements
        int valueToCheck = 6; // the value we want to check if it's in the array
        
        boolean containsValue = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToCheck) { // check if the current element of the array is equal to the value we want to check
                containsValue = true; // if the v alue is found, set the boolean var to true
                break; // break out of the loop since we don't need to chk the rest of the elements
            }
        }
    
        if (containsValue) { // check the boolean var to see if the value was found
            System.out.println("The array contains the value " + valueToCheck);
        }else{
            System.out.println("The array does not contain the value " + valueToCheck);
        }
        
    }
}