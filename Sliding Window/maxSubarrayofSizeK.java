
// package SlidingWindow.java;
import java.util.ArrayList;

class maxSubarrayofSizeK {
    public static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int N) {
        long tempSum = 0;
        long ans = 0;
        int i = 0;
        int j = k;
        for (int a = 0; a < k; a++) {
            tempSum += Arr.get(a).longValue();
        }
        ans = tempSum;
        while (j < N) {
            tempSum = tempSum + Arr.get(j).longValue() - Arr.get(i).longValue();
            ans = Math.max(ans, tempSum);
            i++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        System.out.println(maximumSumSubarray(2, arr, 4));
    }
}