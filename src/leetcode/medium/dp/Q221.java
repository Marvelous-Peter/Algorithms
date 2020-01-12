package leetcode.medium.dp;

public class Q221 {
    public static int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row][col];
        int maxLen = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] == '1' ? 1 : 0;

                } else
                    dp[i][j] = matrix[i][j] == '0' ? 0 : Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }
        return maxLen * maxLen;
    }

    public static void main(String[] args) {

    }
}
