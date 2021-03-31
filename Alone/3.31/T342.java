/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-31 15:01
 * @Description:
 */
public class T342 {

    public boolean isPowerOfFour(int n) {
        int len = 0, tmp = n;
        while (tmp > 0) {
            len ++;
            tmp >>= 1;
        }
        return ((len % 2) == 1) && Integer.bitCount(n) == 1;
    }

    public static void main(String[] args) {
        T342 t342 = new T342();
        System.out.println(t342.isPowerOfFour(16));
    }
}
