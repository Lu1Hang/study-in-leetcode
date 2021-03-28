import java.util.Arrays;
import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-28 14:43
 * @Description:
 */
public class T503 {

    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 2 * len; i++) {
            while (!s.empty() && nums[i % len] > nums[s.peek()]){
                res[s.pop()] = nums[i % len];
            }
            s.push(i % len);
        }
        return res;
    }
}
