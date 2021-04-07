import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: study
 * @BelongsPackage: write
 * @Author: Alone
 * @CreateTime: 2021-04-06 13:31
 * @Description:
 */
public class T451 {

    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        //统计频率
        for (char c : array) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<StringBuilder>[] lists = new List[array.length + 1];
        for (Character c : map.keySet()) {
            int pos = map.get(c);
            if(lists[pos] == null){
                lists[pos] = new ArrayList<>();
            }
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < pos; i++) {
                tmp.append(c);
            }
            lists[pos].add(tmp);
        }
        for (int i = array.length; i >= 0; i--) {
            if(lists[i] != null) {
                for (int j = 0; j < lists[i].size(); j++) {
                    result.append(lists[i].get(j));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        T451 t451 = new T451();
        System.out.println(t451.frequencySort("eeeee"));
    }
}
