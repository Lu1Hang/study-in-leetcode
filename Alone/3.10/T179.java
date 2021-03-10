import java.util.Arrays;
import java.util.Comparator;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-10 14:57
 * @Description:
 */
public class T179 {

    private class CompareClass implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1);
        }
    }

    public String largestNumber(int[] nums) {
        String[] tmp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(tmp, new CompareClass());
        if(tmp[0].equals("0"))
            return "0";
        StringBuilder result = new StringBuilder();
        for (String s : tmp) {
            result.append(s);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        T179 t179 = new T179();
        System.out.println(t179.largestNumber(new int[]{3,30,34,5,9}));
    }
}
