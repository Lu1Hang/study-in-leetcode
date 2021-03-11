/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-11 09:45
 * @Description:
 */
public class Jian66 {

    public int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        if(a.length == 0)
            return b;
        //计算下三角
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            b[i] = a[i - 1] * b[i - 1];
        }
        //计算上三角
        int tmp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }
}
