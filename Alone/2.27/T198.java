/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-02-27 14:01
 * @Description:
 */
public class T198 {

    /**
     * T198 打家劫舍
     * 动态规划
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
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++)
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        T198 t198 = new T198();
        System.out.println(t198.rob(new int[]{2, 7, 9, 3, 1}));
    }
}
