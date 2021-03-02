/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-02 08:07
 * @Description:
 */
public class T322 {

    /**
     * dp 动态规划
     * 状态: dp[i]表示凑成i元需要的最少硬币数
     * 转移方程: dp[i] = min(dp[i-coin[j]] + 1, dp[i])
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if(coins.length < 0)
            return -1;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if(i - coins[j] >= 0 && dp[i - coins[j]] < Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        T322 t322 = new T322();
        System.out.println(t322.coinChange(new int[]{2}, 3));
    }
}
