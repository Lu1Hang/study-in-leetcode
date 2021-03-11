/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-10 14:37
 * @Description:
 */
public class T189 {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        turn(nums, 0, nums.length - 1);
        turn(nums, 0, k - 1);
        turn(nums, k, nums.length - 1);
    }

    public void turn(int[] nums, int begin, int end) {
        while (begin < end) {
            int tmp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = tmp;
            begin ++;
            end --;
        }
    }

    public static void main(String[] args) {
        T189 t189 = new T189();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        t189.rotate(nums, 3);
    }
}
