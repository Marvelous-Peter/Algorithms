package leetcode.medium.dp;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/6/21 16:50
 * 1143
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int row = text1.length(), col = text2.length();
        if (row == 0 || col == 0) {
            return 0;
        }
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }

            }
        }
        return dp[row][col];
    }
}

