import java.util.*;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-22 15:20
 * @Description:
 */
public class T349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> father = new HashSet<>();
        Set<Integer> son = new HashSet<>();
        for (int num : nums1) {
            father.add(num);
        }
        for (int num : nums2) {
            if(father.contains(num))
                son.add(num);
        }
        int[] res = new int[son.size()];
        int tmp = 0;
        Iterator<Integer> iterator = son.iterator();
        while (iterator.hasNext()) {
            res[tmp++] = iterator.next();
        }
        return res;
    }
}
