/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-26 18:25
 * @Description:
 */
public class T64 {

    /**
     * 解题思路: 动态规划
     */
    public int minPathSum(int[][] grid) {
        /**
         * 二维dp版本
         * 转移方程:
         * i = 0, j = 0:dp[i][j] = grid[i][j];
         * i = 0:dp[i][j] = grid[i][j] + dp[i][j - 1];
         * j = 0:dp[i][j] = grid[i][j] + dp[i - 1][j];
         * else:dp[i][j] = grid[i][j] + Math.min(dp[i][j -1], dp[i - 1][j]);
         */
        int m = grid[0].length, n = grid.length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++) {
                if(i == 0 && j == 0){
                    //左上角起点
                    dp[i][j] = grid[i][j];
                } else if(i == 0){
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                } else if(j == 0){
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                } else {
                    dp[i][j] = grid[i][j] + Math.min(dp[i][j -1], dp[i - 1][j]);
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
