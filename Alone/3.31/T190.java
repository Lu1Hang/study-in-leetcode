/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-31 14:36
 * @Description:
 */
public class T190 {

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 1; i <= 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        return result;
    }
}
