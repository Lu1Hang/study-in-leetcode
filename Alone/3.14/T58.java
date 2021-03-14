/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-14 19:25
 * @Description:
 */
public class T58 {

    public int lengthOfLastWord(String s) {
        if(s == null)
            return 0;
        String[] ans = s.split(" ");
        if(ans == null || ans.length == 0)
            return 0;
        return ans[ans.length - 1].length();
    }
}
