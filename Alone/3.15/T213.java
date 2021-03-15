/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-15 20:09
 * @Description:
 */
public class T213 {

    /**
     * T213 打家劫舍2
     * 将循环拆分成2个部分
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return nums[0];
        else if(nums.length == 2)
            return Math.max(nums[0], nums[1]);
        int dp0 = cal(nums, 0, nums.length - 2);
        int dp1 = cal(nums, 1, nums.length - 1);
        return Math.max(dp0, dp1);
    }

    public int cal(int[] nums, int start, int end) {
        if(end - start + 1 == 0)
            return 0;
        else if(end - start + 1 == 1)
            return nums[start];
        else if(end - start + 1 == 2)
            return Math.max(nums[start], nums[end]);
        int dp0 = 0, dp1 = nums[start];
        for (int i = start + 1; i <= end; i++) {
            int tmp = Math.max(dp1, dp0 + nums[i]);
            dp0 = dp1;
            dp1 = tmp;
        }
        return dp1;
    }
}
