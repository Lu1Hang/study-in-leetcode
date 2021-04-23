import java.util.HashMap;
import java.util.Map;

public class T454 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/23 15:37
     * @Param [int[], int[], int[], int[]]
     * @return int
     **/
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                map.put(num1 + num2, map.getOrDefault(num1 + num2, 0) + 1);
            }
        }
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int tmp = num3 + num4;
                if(map.containsKey(0 - tmp))
                    res += map.get(0 - tmp);
            }
        }
        return res;
    }
}