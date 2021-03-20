/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-20 20:11
 * @Description:
 */
public class T650 {

    /**
     * 动态规划
     * 如果一个数是素数，那么最少操作就是一开始复制一个，最后一个个粘贴
     * 如果一个数不是素数，那么最少操作就可以按它的因数分解一下，简化操作。
     * @param n
     * @return
     */
    public int minSteps(int n) {
        int[] dp = new int[1001];
        dp[1] = 0;
        dp[2] = 2;
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 2; j <= (int)Math.sqrt(n); j++) {
                if(i % j == 0) {
                    dp[i] = dp[j] + dp[i / j];
                }
            }
        }
        return dp[n];
    }
}
