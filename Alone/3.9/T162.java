/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-09 09:55
 * @Description:
 */
public class T162 {

    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > nums[mid + 1])
                r = mid;
            else l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        T162 t162 = new T162();
        System.out.println(t162.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}
