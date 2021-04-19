import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-19 14:32
 * @Description:
 */
public class T18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 4)
            return result;
        for (int i = 0; i < nums.length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum < target)
                        l ++;
                    else if(sum > target)
                        r --;
                    else {
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[l], nums[r])));
                        while (l < r && nums[l] == nums[l + 1]) l ++;
                        while (l < r && nums[r] == nums[r - 1]) r --;
                        l ++;
                        r --;
                    }
                }
            }
        }
        return result;
    }
}
