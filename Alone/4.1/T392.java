/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-01 10:28
 * @Description:
 */
public class T392 {

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        for (; i < s.length();) {
            while (j < t.length()){
                if(t.charAt(j) == s.charAt(i)){
                    i ++;
                    j ++;
                    break;
                }
                j ++;
            }
            if(j == t.length())
                break;
        }
        return i >= s.length();
    }
}
