/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-01 09:02
 * @Description:
 */
public class T287 {

    /**
     * 快慢指针
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        //找到相遇点
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        //找到入环点
        int pre1 = 0;
        int pre2 = slow;
        while (pre1 != pre2) {
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }

    public static void main(String[] args) {
        T287 t287 = new T287();
        System.out.println(t287.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println(t287.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        System.out.println(t287.findDuplicate(new int[]{1, 1}));
        System.out.println(t287.findDuplicate(new int[]{1, 1, 2}));
    }
}
