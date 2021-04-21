/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-18 14:47
 * @Description:
 */
public class T696 {

    public int countBinarySubstrings(String s) {
        //按0和1分段统计每一段0（或1）的数量
        //pre表示前一段的数量,cur表示当前段的数量
        int pre = 0, cur = 1, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                cur ++;
            } else {
                pre = cur;
                cur = 1;
            }
            if(pre >= cur)
                res ++;
        }
        return res;
    }
}
