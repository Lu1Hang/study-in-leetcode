/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-18 20:52
 * @Description:
 */
public class T70 {

    /**
     * 解题思路:斐波那契数列
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int f1 = 1, f2 = 1, f3 = 0;
        for (int i = 3; i <= n + 1; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
