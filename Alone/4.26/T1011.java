/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-26 13:15
 * @Description:
 */
public class T1011 {

    public int shipWithinDays(int[] weights, int D) {
        //确定二分边界
        int l = 0, r = 0;
        for (int weight : weights) {
            r += weight;
            l = Math.max(weight, l);
        }
        while (l < r) {
            int mid = l + (r - l) / 2;
            if(check(weights, D, mid)) {
                r = mid;
            } else
                l = mid + 1;
        }
        return l;
    }

    /**
     * @Author Alone
     * @Description 判断是否满足题意
     * @Date  2021/4/26 13:19
     * @Param [int[], int, int]
     * @return boolean
     **/
    public boolean check(int[] weights, int d, int maxx) {
        int cnt = 0, sum = 0;
        for (int i = 0; i < weights.length;) {
            while (i < weights.length && sum + weights[i] <= maxx) {
                sum += weights[i++];
            }
            cnt ++;
            sum = 0;
        }
        return cnt <= d;
    }

    public static void main(String[] args) {
        T1011 t1011 = new T1011();
        System.out.println(t1011.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }
}
