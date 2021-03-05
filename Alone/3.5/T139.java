import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-05 07:58
 * @Description:
 */
public class T139 {

    /**
     * 动态规划
     * dp[i]表示s[0,i-1]可以被单词表拆分为一个或多个在字典中出现的单词
     * dp[i] = s[j:i) in wordDict && dp[j] for j in [0,i)
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int right = 1; right <= s.length(); right++) {
            for (int left = right - 1; left >= 0; left--) {
                if(dp[left] && wordDict.contains(s.substring(left, right))){
                    dp[right] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
