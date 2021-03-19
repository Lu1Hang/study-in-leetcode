/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-18 21:51
 * @Description:
 */
public class T121 {

    /**
     * dp方法
     * 原数组两个元素的最大差等于求差数组的最大子序和！！！
     * 先求一个数组的差序列(相邻元素的差)
     * dp[i] = max(0, dp[i-1]+diff[i])
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int[] diff = new int[prices.length];
        int[] dp = new int[prices.length];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            diff[i] = prices[i] - prices[i - 1];
        }
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(0, dp[i - 1] + diff[i]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
