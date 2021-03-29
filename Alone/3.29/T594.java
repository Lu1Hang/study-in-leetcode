import java.util.*;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-29 15:07
 * @Description:
 */
public class T594 {

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        for (Integer integer : map.keySet()) {
            if(map.containsKey(integer + 1)){
                result = Math.max(result, map.get(integer) + map.get(integer + 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        T594 t594 = new T594();
        System.out.println(t594.findLHS(new int[]{-3,-1,-1,-1,-3,-2}));
    }
}
