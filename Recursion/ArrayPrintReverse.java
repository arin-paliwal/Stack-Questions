// package Recursion_Basics;

public class ArrayPrintReverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printArrayReverseRecursive(arr, arr.length - 1);
    }

    public static void printArrayReverseRecursive(int[] arr, int index) {
        if (index < 0) {
            return; 
        }
        System.out.println(arr[index]); 
        printArrayReverseRecursive(arr, index - 1); 
    }
}
