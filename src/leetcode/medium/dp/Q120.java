package leetcode.medium.dp;

import java.util.List;

public class Q120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0 || triangle.get(0).size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n ; i++) {
            dp[n - 1][i] = triangle.get(n - 1).get(i);
        }
        for (int j = n-2; j >=0; j--) {
            List<Integer> curr = triangle.get(j);
            for (int k = 0; k < curr.size(); k++) {
                dp[j][k] = Math.min(dp[j + 1][k], dp[j + 1][k + 1])+curr.get(k);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {

    }
}
