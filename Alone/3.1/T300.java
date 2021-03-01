/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-01 09:29
 * @Description:
 */
public class T300 {

    /**
     * dp+二分
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int l = 0, r = 0, mid = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            l = 0; r = res;
            while (l < r) {
                mid = (l + r) / 2;
                if(nums[i] > dp[mid])
                    l = mid + 1;
                else r = mid;
            }
            dp[l] = nums[i];
            if(r == res)
                res ++;
        }
        return res;
    }

    public static void main(String[] args) {
        T300 t300 = new T300();
        System.out.println(t300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(t300.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }
}
