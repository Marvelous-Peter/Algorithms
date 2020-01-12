package leetcode.medium.dp;

public class Q63 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        if (obstacleGrid.length==0 || obstacleGrid[0].length==0 || obstacleGrid[0][0] == 1){
            return 0;
        }

        dp[0][0] = 1;
        for (int i = 1; i < obstacleGrid.length; i++) {
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i - 1][0];
        }

        for (int j = 1; j < obstacleGrid[0].length; j++) {
            dp[0][j] = obstacleGrid[0][j] == 1 ? 0 : dp[0][j - 1];
        }

        for (int m = 1; m < obstacleGrid.length; m++) {
            for (int n = 1; n < obstacleGrid[0].length; n++) {
                dp[m][n] = obstacleGrid[m][n] == 1 ? 0 : dp[m - 1][n] + dp[m][n - 1];
            }
        }

        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
}
