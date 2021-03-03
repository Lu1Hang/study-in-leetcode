import java.util.Arrays;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-03 07:58
 * @Description:
 */
public class T56 {

    /**
     * 贪心
     * 将区间按左端点大小进行排序，然后遍历区间，
     * 若当前区间的左端点小于结果集中最后一个区间的右端点，即可合并两个区间
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        //对左端点进行排序
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int[][] result = new int[intervals.length][2];
        int length = -1;
        for (int[] interval : intervals) {
            if(length == -1 || interval[0] > result[length][1]) {
                result[++length] = interval;
            } else {
                result[length][1] = Math.max(interval[1], result[length][1]);
            }
        }
        return Arrays.copyOf(result, length + 1);
    }

    public static void main(String[] args) {
        T56 t56 = new T56();
        System.out.println(t56.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
    }
}
