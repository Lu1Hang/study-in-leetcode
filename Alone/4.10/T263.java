/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-10 10:00
 * @Description:
 */
public class T263 {

    /**
     * @Author Alone
     * @Description 丑数
     * @Date  2021/4/10 10:24
     * @Param [int]
     * @return boolean
     **/
    public boolean isUgly(int n) {
        if(n <= 0)
            return false;
        boolean flag = false;
        while (n % 2 == 0) {
            n /= 2;
        }
        if(n == 1)
            flag = true;
        while (n % 3 == 0) {
            n /= 3;
        }
        if(n == 1)
            flag = true;
        while (n % 5 == 0) {
            n /= 5;
        }
        if(n == 1)
            flag = true;
        return flag;
    }
}
