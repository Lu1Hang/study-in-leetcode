/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-30 19:04
 * @Description:
 */
public class T268 {

    public int missingNumber(int[] nums) {
        int sum = (1 + nums.length) * nums.length / 2;
        int co = 0;
        for (int num : nums) {
            co += num;
        }
        return sum - co;
    }
}
