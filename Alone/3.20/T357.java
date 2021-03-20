/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-20 17:37
 * @Description:
 */
public class T357 {

    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 10;
        int sum = 9;
        for (int i = 2; i <= Math.min(10, n); i++) {
            sum *= (10 - i + 1);
            dp[i] = sum + dp[i - 1];
        }
        return n > 10 ? dp[10] : dp[n];
    }
}
