import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-16 16:01
 * @Description:
 */
public class T205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> maps = new HashMap<>();
        Map<Character, Character> mapt = new HashMap<>();
        StringBuilder tmps = new StringBuilder();
        StringBuilder tmpt = new StringBuilder();
        int cmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if(!maps.containsKey(s.charAt(i))) {
                maps.put(s.charAt(i), (char)('a' + cmp));
                cmp ++;
            }
            tmps.append(maps.get(s.charAt(i)));
        }
        cmp = 0;
        for (int i = 0; i < t.length(); i++) {
            if(!mapt.containsKey(t.charAt(i))) {
                mapt.put(t.charAt(i), (char)('a' + cmp));
                cmp ++;
            }
            tmpt.append(mapt.get(t.charAt(i)));
        }
        //这个地方不能直接等于，因为StringBuilder没有重写equals方法
        return tmps.toString().equals(tmpt.toString());
    }

    public static void main(String[] args) {
        T205 t205 = new T205();
        System.out.println(t205.isIsomorphic("egg", "add"));
    }
}
