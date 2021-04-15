/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-15 15:26
 * @Description:
 */
public class T565 {

    public int arrayNesting(int[] nums) {
        //出现过的元素会形成一个闭环
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = i; nums[j] != -1 ;) {
                cnt ++;
                int tmp = nums[j];
                nums[j] = -1;
                j = tmp;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}
