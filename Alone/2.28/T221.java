/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-02-28 09:10
 * @Description:
 */
public class T221 {

    /**
     * T221 最大正方形
     * 动态规划
     * dp[i + 1][j + 1]表示以(i,j)为右下角的正方形的最大边长
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return 0;
        int result = 0;
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < matrix[0].length + 1; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '1')
                    dp[i + 1][j + 1] = Math.min(dp[i][j], Math.min(dp[i + 1][j], dp[i][j + 1])) + 1;
                result = Math.max(dp[i + 1][j + 1], result);
            }
        }
        return result * result;
    }
}
