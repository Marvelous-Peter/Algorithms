package leetcode.simple.dp;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/4 22:46
 */
public class ClimbStairs {
    //时间O(n) 空间O(n)
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //时间O(n) 空间O(1)
    public int climbStairs2(int n) {
        if (n == 1) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }


    public static void main(String[] args) {
        int n = 3;
        int res = new ClimbStairs().climbStairs2(n);
        System.out.println(res);
    }
}
