public class T287 {

    /**
     * @Author Alone
     * @Description 二刷 二分法 35 1095 4
     * @Date  2021/4/14 15:19
     * @Param [int[]]
     * @return int
     **/
    public int findDuplicate(int[] nums) {
        int l = 1, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;//注意此处是向下取整
            int cnt = 0;
            //统计小于等于mid的数的个数
            for (int num : nums) {
                if(num <= mid)
                    cnt ++;
            }
            if(cnt > mid)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}