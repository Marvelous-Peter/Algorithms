package leetcode.medium.dp;

public class Q64 {
    public static int minPathSum(int[][] grid) {
        if (grid.length == 0 && grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int a = 1; a < m; a++) {
            dp[a][0] = dp[a - 1][0] + grid[a][0];
        }
        for (int b = 1; b < n; b++) {
            dp[0][b] = dp[0][b - 1] + grid[0][b];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{2,5,1},{4,2,1}};
        System.out.println(minPathSum(arr));
    }
}
