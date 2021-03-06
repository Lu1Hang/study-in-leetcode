/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-06 17:12
 * @Description:
 */
public class T334 {
    public boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE, two = Integer.MAX_VALUE;
        for (int num : nums) {
            if(num <= one)
                one = num;
            else if(num <= two)
                two = num;
            else
                return true;
        }
        return false;
    }
}
