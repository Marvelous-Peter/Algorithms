package leetcode.medium.dp;

import java.util.Arrays;

/**
 * 最大子序列和
 * @author marongxin
 * @version 1.0
 * @date 2020/6/21 18:03
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (isNotLegal(nums)){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length ; i++) {
            dp[i] = (dp[i - 1] >= 0) ? (dp[i - 1] + nums[i]) : nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        if (isNotLegal(nums)){
            return 0;
        }
        int prev = nums[0];
        int max = prev;
        for (int i = 1; i < nums.length ; i++) {
            prev = (prev >= 0) ? (prev + nums[i]) : nums[i];
            max = Math.max(max, prev);
        }
        return max;
    }

    private boolean isNotLegal(int[] nums) {
        return nums == null || nums.length == 0;
    }
}
