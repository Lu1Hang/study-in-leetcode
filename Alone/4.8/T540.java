/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-08 19:49
 * @Description:
 */
public class T540 {

    public int singleNonDuplicate(int[] nums) {
        //每次二分都是将数组分为满足条件的和不满足条件的
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if(nums[mid] == nums[mid + 1]) {
                //是重复的中的前一个
                if((r - mid + 1) % 2 == 1)
                    l = mid + 2;
                else
                    r = mid - 1;
            } else if(nums[mid] == nums[mid - 1]){
                //是重复的中的后一个
                if((r - mid) % 2 == 0){
                    //右边为偶数个数
                    r = mid - 2;
                } else
                    l = mid + 1;
            }
        }
        return nums[l];
    }
}
