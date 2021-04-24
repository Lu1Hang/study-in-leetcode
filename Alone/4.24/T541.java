/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-24 15:50
 * @Description:
 */
public class T541 {

    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int p = 0;
        while (p < s.length()){
            String tmp = s.substring(p, p + k < s.length() ? p + k : s.length());
            res.append(reverse(tmp));
            if(p + k < s.length()) {
                String s2 = s.substring(p + k, p + 2 * k < s.length() ? p + 2 * k : s.length());
                res.append(s2);
            }
            p += 2 * k;
        }
        return res.toString();
    }

    public String reverse(String s) {
        char[] array = s.toCharArray();
        int l = 0, r = array.length - 1;
        while (l < r) {
            char tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
            l++;
            r--;
        }
        return new String(array);
    }
}
