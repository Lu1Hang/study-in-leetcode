import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-22 16:01
 * @Description:
 */
public class T202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int tmp = getSquareSum(n);
            if(set.contains(tmp))
                return false;
            set.add(tmp);
            n = tmp;
        }
        return true;
    }

    public int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
