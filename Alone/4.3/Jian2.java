/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-03 19:18
 * @Description:
 */
public class Jian2 {

    public String replaceSpace(String s) {
        if(s == null){
            return null;
        }
        int co = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                co ++;
        }
        char[] str = new char[s.length() + co * 2];
        int p1 = s.length() - 1, p2 = str.length - 1;
        while (p1 >= 0){
            if(s.charAt(p1) == ' '){
                str[p2 --] = '0';
                str[p2 --] = '2';
                str[p2 --] = '%';
            } else {
                str[p2 --] = s.charAt(p1);
            }
            p1 --;
        }
        return String.valueOf(str);
    }
}
