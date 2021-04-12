import java.util.Arrays;
import java.util.Comparator;

public class T179 {

    /**
     * @Author Alone
     * @Description 4.12每日一题
     * @Date  2021/4/12 14:26
     * @Param [int[]]
     * @return java.lang.String
     **/
    public String largestNumber(int[] nums) {
        StringBuilder s = new StringBuilder();
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, new MyComparator());
        if(str[0].equals("0"))//避免出现多个0的情况
            return "0";
        for (String s1 : str) {
            s.append(s1);
        }
        return s.toString();
    }

    private class MyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String tmp1 = o1 + o2;
            String tmp2 = o2 + o1;
            return tmp2.compareTo(tmp1);
        }
    }
}