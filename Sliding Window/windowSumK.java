public class windowSumK {

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 4, 5 };
        int k = 5;
        int[] result = findMaxSubarray(nums, k);
        if (result == null) {
            System.out.println("No subarray found with sum = " + k);
        } else {
            System.out.println("Maximum subarray with sum " + k + " is:");
            for (int i = result[0]; i <= result[1]; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static int[] findMaxSubarray(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int left = 0;
        int right = -1;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                right = i;
                break;
            }
        }
        if (right == -1) {
            return null;
        } else {
            return new int[] { left, right };
        }
    }

}
