import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @Description:
 */
public class T524 {

    public String findLongestWord(String s, List<String> d) {
        String result = "";
        for (String s1 : d) {
            if(isSubquence(s, s1)){
                if(s1.length() > result.length() || (s1.length() == result.length() && s1.compareTo(result) < 0))
                    result = s1;
            }
        }
        return result;
    }

    /**
     * 双指针比较字串
     * @param s
     * @param c
     * @return
     */
    public boolean isSubquence(String s, String c){
        int i = 0, j = 0;
        for(; i < s.length() && j < c.length(); i ++){
            if(s.charAt(i) == c.charAt(j))
                j++;
        }
        if(j == c.length())
            return true;
        else
            return false;
    }
}
