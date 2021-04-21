/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-14 17:18
 * @Description:
 */
public class T35 {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if(nums[r] < target)
            return r + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        T35 t35 = new T35();
        System.out.println(t35.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
