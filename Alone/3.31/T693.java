/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-31 15:14
 * @Description:
 */
public class T693 {

    public boolean hasAlternatingBits(int n) {
        int cmp1 = (Integer.highestOneBit(n) << 1) - 1;
        int cmp2 = n ^ (n >> 1);
        return cmp1 == cmp2;
    }
}
