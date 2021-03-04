import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-04 08:43
 * @Description:
 */
public class T78 {

    /**
     * 回溯算法
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        cal(0, nums, result, new ArrayList<>());
        return result;
    }

    public void cal(int pos, int[] nums, List<List<Integer>> result, ArrayList<Integer> tmp) {
        result.add(new ArrayList<>(tmp));
        for (int i = pos; i < nums.length; i++) {
            tmp.add(nums[i]);
            cal(i + 1, nums, result, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
