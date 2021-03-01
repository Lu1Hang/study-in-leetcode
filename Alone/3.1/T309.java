/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-01 09:54
 * @Description:
 */
public class T309 {

    /**
     * 动态规划
     * 总共3种状态: 0->非卖出的不持股状态 1->买入 2->卖出
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;
        int[][] dp = new int[prices.length][3];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][2]);
    }
}
