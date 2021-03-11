import java.util.Arrays;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-11 09:15
 * @Description:
 */
public class T16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1, mid = 0;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(sum - target) < Math.abs(ans - target)){
                    ans = sum;
                }
                if(sum > target)
                    r --;
                else
                    l ++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        T16 t16 = new T16();
        System.out.println(t16.threeSumClosest(new int[]{1, 1, -1, -1, 3}, -1));
    }
}
