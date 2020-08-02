package leetcode.simple.dp;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/1 0:22
 */
public class MaxSubArray_16_17 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] < 0 ? nums[i] : nums[i] + dp[i - 1];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
