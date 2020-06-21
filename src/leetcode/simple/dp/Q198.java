package leetcode.simple.dp;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/6/16 22:42
 */
public class Q198 {

    //O(n)
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }

        return dp[nums.length];
    }


    //O(1)
    public int rob2(int[] nums) {
        int pre = 0;
        int curr = 0;

        for (int num : nums) {
            int temp = Math.max(curr, pre + num);
            pre = curr;
            curr = temp;
        }
        return curr;
    }
}
