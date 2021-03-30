/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-30 19:08
 * @Description:
 */
public class T260 {

    /**
     * 将数组按某种方式拆分成两个部分，每个部分分别异或
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {
        int mid = 0;
        for (int num : nums) {
            mid ^= num;
        }
        int rule = Integer.highestOneBit(mid);
        int[] result = new int[]{0, 0};
        for (int num : nums) {
            if((num & rule) == 0)
                result[0] ^= num;
        }
        result[1] = result[0] ^ mid;
        return result;
    }
}
