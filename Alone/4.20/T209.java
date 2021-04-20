/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-20 11:28
 * @Description:
 */
public class T209 {

    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, ans = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target){
                ans = Math.min(ans, i - l + 1);
                sum -= nums[l++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        T209 t209 = new T209();
        System.out.println(t209.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
