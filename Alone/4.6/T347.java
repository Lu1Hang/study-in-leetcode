import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class T347 {
    /**
     * 方法二:桶排序法
     * 首先使用哈希表统计频率，统计完成后，创建一个数组，将频率作为数组下标，
     * 对于出现频率不同的数字集合存入对应的数组下标即可
     * @CreateTime: 2021-04-06 11:56
     */
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        //统计频率
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //桶排序
        List<Integer>[] lists = new List[nums.length + 1];
        for (Integer integer : map.keySet()) {
            Integer value = map.get(integer);
            if(lists[value] == null){
                lists[value] = new ArrayList<>();
            }
            lists[value].add(integer);
        }
        int p = 0;
        for (int i = lists.length - 1; i >= 0; i--) {
            if(lists[i] == null)
                continue;
            Iterator<Integer> it = lists[i].iterator();
            while (it.hasNext() && p < k) {
                result[p ++] = it.next();
            }
            if(p >= k)
                break;
        }
        return result;
    }
}