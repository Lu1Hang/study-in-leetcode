import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-23 16:04
 * @Description:
 */
public class T383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomMap.put(ransomNote.charAt(i), ransomMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        Iterator<Character> iterator = ransomMap.keySet().iterator();
        while (iterator.hasNext()) {
            char now = iterator.next();
            if(!magazineMap.containsKey(now) || ransomMap.get(now) > magazineMap.get(now))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        T383 t383 = new T383();
        System.out.println(t383.canConstruct("aa", "aab"));
    }
}
