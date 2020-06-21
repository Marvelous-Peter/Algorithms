package leetcode.simple.dp;

/**
 * 使用最小花费爬楼梯
 *
 * @author marongxin
 * @version 1.0
 * @date 2020/6/21 19:24
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length <= 2) {
            return 0;
        }
        int[] dp = new int[cost.length];
        dp[0] = 0;
        dp[1] = Math.min(cost[0], cost[1]);
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 2]+cost[i-1 ] ,dp[i-1]+ cost[i]);
        }
        return dp[cost.length-1];
    }
}
