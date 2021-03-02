import java.util.*;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-02 08:52
 * @Description:
 */
public class T347 {

    /**
     * 前K个高频元素
     * 小顶堆
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0 || nums == null)
            return null;
        //统计每个元素出现的次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        //构造最小堆
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (Integer key : map.keySet()) {
            if(pq.size() < k){
                pq.add(key);
            } else if(map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        //取出最小堆中的元素
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = pq.remove();
        }
        return result;
    }
}
