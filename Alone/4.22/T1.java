import java.util.HashMap;
import java.util.Map;

public class T1 {
    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/22 16:09
     * @Param [int[], int]
     * @return int[]
     **/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            map.put(target - nums[i], i);
        }
        return res;
    }
}