/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-09 15:00
 * @Description:
 */
public class T154 {

    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (r >= 0 && nums[r] == nums[0]) r--;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if(nums[mid] >= nums[l])
                l = mid;
            else
                r = mid - 1;
        }
        return r + 1 < nums.length ? nums[r + 1] : nums[0];
    }
}
