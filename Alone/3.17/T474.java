/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-17 16:37
 * @Description:
 */
public class T474 {

    public int findMaxForm(String[] strs, int m, int n) {
        //表示0-i内使用j个0 k个1的最大子集数
        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
        dp[0][0][0] = 0;
        for (int i = 1; i <= strs.length; i++) {
            int[] count = count0(strs[i - 1]);
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    int zero = count[0];
                    int one = count[1];
                    if(j >= zero && k >= one){
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - zero][k - one] + 1);
                    }
                }
            }
        }
        return dp[strs.length][m][n];
    }

    public int[] count0(String str){
        int[] cnt = new int[2];
        for (char c : str.toCharArray()) {
            cnt[c - '0'] ++;
        }
        return cnt;
    }
}
