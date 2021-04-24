public class T27 {
    /**
     * @Author Alone
     * @Description 三刷
     * @Date  2021/4/24 16:41
     * @Param [int[], int]
     * @return int
     **/
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[ans++] = nums[i];
            }
        }
        return ans;
    }
}