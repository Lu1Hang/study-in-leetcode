/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-07 14:24
 * @Description:
 */
public class T80 {

    /**
     * @Author Alone
     * @Description 快慢指针
     * @Date  2021/4/7 15:13
     * @Param [int[]]
     * @return int
     **/
    public int removeDuplicates(int[] nums) {
        //slow指向将要被替换的位置 fast进行遍历
        //0 ~ slow - 1这段区间是已经满足要求的 满足最多只有1次重复需要将fast与slow-2做比较
        if(nums.length <= 2)
            return nums.length;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(slow < 2 || nums[fast] != nums[slow - 2]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
