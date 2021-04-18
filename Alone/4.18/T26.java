/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-18 12:37
 * @Description:
 */
public class T26 {

    public int removeDuplicates(int[] nums) {
        int p1 = 0, p2 = 0;
        while (p2 < nums.length) {
            if(nums[p2] == nums[p1])
                p2 ++;
            else {
                nums[++p1] = nums[p2];
                p2 ++;
            }
        }
        return p1 + 1;
    }
}
