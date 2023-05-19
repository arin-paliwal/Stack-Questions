// package Recursion_Basics;

public class max {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 9, 2 };
        int max = findMaxRecursive(arr, 0);
        System.out.println("Maximum element: " + max);
    }

    public static int findMaxRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int current = arr[index];
        int leftOver = findMaxRecursive(arr, index + 1); 
        return Math.max(current, leftOver); 
    }
}
