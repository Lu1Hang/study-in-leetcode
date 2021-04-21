/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-17 15:29
 * @Description:
 */
public class T9 {

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int start = 0, end = s.length() - 1;
        while (start <= end && start < s.length() && end >= 0) {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start ++;
            end --;
        }
        return true;
    }
}
