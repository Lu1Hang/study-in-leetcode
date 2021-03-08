/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-08 13:59
 * @Description:
 */
public class T91 {

    public int numDecodings(String s) {
        char[] array = s.toCharArray();
        if(array == null || array[0] == '0')
            return 0;
        int[] dp = new int[array.length + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i] - '0';
            if(tmp == 0){
                tmp += (array[i - 1] - '0') * 10;
                if(tmp >= 10 && tmp <= 26)
                    dp[i + 1] += dp[i - 1];
                else
                    return 0;
            } else {
                tmp += (array[i - 1] - '0') * 10;
                if(tmp >= 10 && tmp <= 26)
                    dp[i + 1] += dp[i - 1];
                dp[i + 1] += dp[i];
            }
        }
        return dp[array.length];
    }
}
