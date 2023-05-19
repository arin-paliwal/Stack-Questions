// package Recursion_Basics;

public class printArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printArrayRecursive(arr, 0);
    }

    public static void printArrayRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            return; 
        }
        System.out.println(arr[index]); 
        printArrayRecursive(arr, index + 1); 
    }
}
