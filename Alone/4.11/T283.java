/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-11 15:05
 * @Description:
 */
public class T283 {

    public void moveZeroes(int[] nums) {
        int p0 = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && p0 == -1)
                p0 = i;
            if(nums[i] != 0 && p0 != -1) {
                nums[p0] = nums[i];
                nums[i] = 0;
                p0 ++;
            }
        }
    }
}
