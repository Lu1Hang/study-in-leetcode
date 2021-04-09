/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-09 14:34
 * @Description:
 */
public class T34 {

    /**
     * @Author Alone
     * @Description 在排序数组中查找元素的第一个和最后一个位置
     * @Date  2021/4/9 14:56
     * @Param [int[], int]
     * @return int[]
     **/
    public int[] searchRange(int[] nums, int target) {
        //二分查找计算中位数有两种方式，一种在遇到等号时偏左，一种偏右
        int[] result = new int[2];
        int l = 0, r = nums.length - 1, mid = 0;
        while (l < r) {
            mid = l + r + 1 >> 1;//偏右
            if(nums[mid] > target)
                r = mid - 1;
            else
                l = mid;
        }
        result[1] = (l >= nums.length || nums[l] != target) ? -1 : l;
        l = 0; r = nums.length - 1;
        while (l < r) {
            mid = l + (r - l) / 2;//偏左
            if(nums[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }
        result[0] = (l >= nums.length || nums[l] != target) ? -1 : l;
        return result;
    }

    public static void main(String[] args) {
        T34 t34 = new T34();
        System.out.println(t34.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }
}
