import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-13 23:16
 * @Description:
 */
public class T645 {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if(s.contains(num)){
                result[0] = num;
            }
            s.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(!s.contains(i)){
                result[1] = i;
            }
        }
        return result;
    }
}
