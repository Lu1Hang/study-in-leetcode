/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-07 15:18
 * @Description:
 */
public class T33 {

    /**
     * @Author Alone
     * @Description 二分查找 船新版本
     * @Date  2021/4/7 15:18
     * @Param [int[], int]
     * @return int
     **/
    public int search(int[] nums, int target) {
        //拿nums[mid]值与nums[l]比较，如果小于则mid~r为递增，反之则l~mid为递增
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if(target == nums[mid])
                return mid;
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
        return -1;
    }

    public static void main(String[] args) {
        T33 t33 = new T33();
        System.out.println(t33.search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}
