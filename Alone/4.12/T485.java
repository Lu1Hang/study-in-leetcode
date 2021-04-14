/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-12 14:36
 * @Description:
 */
public class T485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        if(nums[0] == 1)
            dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == 1)
                dp[i] = dp[i - 1] + 1;
        }
        int res = 0;
        for (int num : dp) {
            res = Math.max(res, num);
        }
        return res;
    }
}
