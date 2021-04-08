/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-08 13:38
 * @Description:
 */
public class T153 {

    /**
     * @Author Alone
     * @Description 二分查找
     * @Date  2021/4/8 14:32
     * @Param [int[]]
     * @return int
     **/
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
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
