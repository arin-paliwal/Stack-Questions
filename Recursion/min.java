// package Recursion_Basics;

public class min {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 9, 2 };
        int max = findMinRecursive(arr, 0);
        System.out.println("Minimum element: " + max);
    }

    public static int findMinRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int current = arr[index];
        int leftOver = findMinRecursive(arr, index + 1);
        return Math.min(current, leftOver);
    }
}
