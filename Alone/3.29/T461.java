/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-29 15:46
 * @Description:
 */
public class T461 {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
