/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-23 16:46
 * @Description:
 */
public class T344 {

    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < r){
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}
