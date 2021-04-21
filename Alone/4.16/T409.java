/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-16 15:56
 * @Description:
 */
public class T409 {

    public int longestPalindrome(String s) {
        int[] times = new int[52];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                times[s.charAt(i) - 'A']++;
            else
                times[s.charAt(i) - 'a' + 26]++;
        }
        int res = 0;
        for (int time : times) {
            if(time % 2 == 0)
                res += time;
            else {
                if(res % 2 == 1)
                    res += time - 1;
                else
                    res += time;
            }
        }
        return res;
    }
}
