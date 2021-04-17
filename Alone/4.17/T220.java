import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-17 13:59
 * @Description:
 */
public class T220 {

    //没太弄懂
    private long size;

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        size = t + 1;
        Map<Long, Long> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long tmp = nums[i] * 1L;
            long idx = getIdx(tmp);
            if(hashmap.containsKey(idx)) return true;
            long left = idx - 1, right = idx + 1;
            if(hashmap.containsKey(left) && Math.abs(hashmap.get(left) - tmp) <= t) return true;
            if(hashmap.containsKey(right) && Math.abs(hashmap.get(right) - tmp) <= t) return true;
            hashmap.put(idx, tmp);
            if(i >= k) hashmap.remove(getIdx(nums[i - k] * 1L));
        }
        return false;
    }

    private long getIdx(long u) {
        return u >= 0 ? u / size : (u + 1) / size - 1;
    }
}
