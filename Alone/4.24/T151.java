/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-24 16:06
 * @Description:
 */
public class T151 {

    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            if(i == s.length() || s.charAt(i) == ' ') {
                if(tmp.length() != 0 && res.length() != 0)
                    res.insert(0, ' ');
                res.insert(0, tmp);
                tmp = new StringBuilder();
            } else {
                tmp.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        T151 t151 = new T151();
        System.out.println(t151.reverseWords("  hello world!  "));
    }
}
