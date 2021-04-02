/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-02 12:43
 * @Description:
 */
public class T633 {

    public boolean judgeSquareSum(int c) {
        int l = 0, r = (int)Math.sqrt(c);
        while (l <= r) {
            if(l * l + r * r == c){
                return true;
            } else if(l * l + r * r < c)
                l ++;
            else
                r --;
        }
        return false;
    }
}
