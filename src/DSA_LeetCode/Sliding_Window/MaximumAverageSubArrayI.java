package DSA_LeetCode.Sliding_Window;

public class MaximumAverageSubArrayI {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i = k; i < n; i++){
            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
    public static void main(String[] args) {
        MaximumAverageSubArrayI ma = new MaximumAverageSubArrayI();
        System.out.println(ma.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4
        ));
    }
}
