/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-03 08:55
 * @Description:
 */
public class T75 {

    /**
     * 三指针
     * @param nums
     */
    public void sortColors(int[] nums) {
        if(nums == null || nums.length <= 1)
            return;
        int p1 = 0, p2 = nums.length - 1;
        for (int i = p1; i <= p2; i++) {
            if(nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = tmp;
                p1 ++;
            } else if(nums[i] == 2) {
                nums[i--] = nums[p2];//这里i--是因为需要重新判断换过来的数
                nums[p2--] = 2;
            }
        }
    }
}
