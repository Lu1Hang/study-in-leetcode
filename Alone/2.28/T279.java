/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-02-28 09:52
 * @Description:
 */
public class T279 {

    /**
     * T279 完全平方数
     * 动态规划 完全背包问题
     * 1.dp[i]是干啥的
     * 2.状态转移方程
     * 3.初始值
     * 4.如何遍历
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for(int j = 1; i - j * j >= 0; j++)
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
        }
        return dp[n];
    }
}
