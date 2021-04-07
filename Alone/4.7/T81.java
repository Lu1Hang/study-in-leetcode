/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-07 15:43
 * @Description:
 */
public class T81 {

    /**
     * @Author Alone
     * @Description
     * @Date  2021/4/7 15:43
     * @Param [int[], int]
     * @return boolean
     **/
    public boolean search(int[] nums, int target) {
        //二分的本质是两段性，并非单调性。只要一段满足某个性质，另外一段不满足某个性质，就可以用二分
        if(nums[0] == nums[nums.length - 1]){
            for (int num : nums) {
                if(target == num)
                    return true;
            }
            return false;
        }
        //拿nums[mid]值与nums[l]比较，如果小于则mid~r为递增，反之则l~mid为递增
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if(target == nums[mid])
                return true;
            if(nums[l] <= nums[mid]) {
                //left ~ mid有序
                if(target >= nums[l] && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            } else{
                //mid ~ right有序
                if(target > nums[mid] && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        T81 t81 = new T81();
        System.out.println(t81.search(new int[]{1, 0, 1, 1, 1}, 0));
    }
}
