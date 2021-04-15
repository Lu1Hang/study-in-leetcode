/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-15 15:35
 * @Description:
 */
public class T769 {

    public int maxChunksToSorted(int[] arr) {
        // 在遍历数组的过程中，不停的去更新当前的最大值
        // 如果已经遍历的数字中已经包含了小于当前最大值的所有值，那么就可以分为一块
        if(arr.length == 0)
            return 0;
        int res = 0, maxx = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxx = Math.max(maxx, arr[i]);
            if(i == maxx) res ++;
        }
        return res;
    }
}
