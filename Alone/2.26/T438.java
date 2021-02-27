import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-02-26 16:48
 * @Description:
 */
public class T438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s == null || s.equals(""))
            return result;
        int l = 0;
        int[] co = new int[26];
        int[] po = new int[26];
        for (int i = 0; i < p.length(); i++) {
            po[(p.charAt(i) - 'a')] ++;
        }
        for (int i = 0; i <= s.length(); i++) {
            if(i < p.length() && i != s.length())
                co[(s.charAt(i) - 'a')]++;
            else {
                boolean flag = true;
                for (int j = 0; j < 26; j++) {
                    if(co[j] != po[j]){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    result.add(l);
                co[(s.charAt(l) - 'a')]--;
                if(i != s.length())
                    co[(s.charAt(i) - 'a')]++;
                l++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        T438 t438 = new T438();
        System.out.println(t438.findAnagrams("", "a"));
    }
}
