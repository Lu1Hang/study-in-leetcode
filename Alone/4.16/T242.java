/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-16 15:25
 * @Description:
 */
public class T242 {

    public boolean isAnagram(String s, String t) {
        int[] times = new int[26];
        int[] timet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            times[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < t.length(); i++) {
            timet[t.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < 26; i++) {
            if(times[i] != timet[i])
                return false;
        }
        return true;
    }
}
