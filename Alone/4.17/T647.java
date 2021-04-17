/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-17 15:11
 * @Description:
 */
public class T647 {

    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += cal(s, i, i);
            res += cal(s, i, i + 1);
        }
        return res;
    }

    public int cal(String s, int start, int end) {
        int res = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            res++;
            start--;
            end++;
        }
        return res;
    }
}
