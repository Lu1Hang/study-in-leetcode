import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-29 14:02
 * @Description:
 */
public class T217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(s.contains(nums[i]))
                return true;
            else
                s.add(nums[i]);
        }
        return false;
    }
}
