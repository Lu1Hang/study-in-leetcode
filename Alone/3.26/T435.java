import java.util.Arrays;
import java.util.Comparator;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-26 18:26
 * @Description:
 */
public class T435 {

    /**
     * 贪心算法解决区间调度问题
     * 按end排序,每次找区间不重叠的
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int[] now = intervals[0];
        int result = 1;
        for (int[] interval : intervals) {
            if(now[1] <= interval[0]){
                result ++;
                now = interval;
            }
        }
        return intervals.length - result;
    }
}
