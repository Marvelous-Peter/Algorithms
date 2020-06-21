package leetcode.simple.dp;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/6/21 17:38
 */
public class SubSequence {
    public boolean isSubsequence(String s, String t) {
        if ((!s.isEmpty() && t.isEmpty()) || s.length() > t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }
        int row = s.length(), col = t.length();
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        return dp[row][col] == row;
    }
}
