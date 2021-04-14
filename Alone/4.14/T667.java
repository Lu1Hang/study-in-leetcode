/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-14 16:12
 * @Description:
 */
public class T667 {

    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1, inteval = k; i <= k; i++, inteval--) {
            result[i] = i % 2 == 1 ? result[i - 1] + inteval : result[i - 1] - inteval;
        }
        for (int i = k + 1; i < n; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
