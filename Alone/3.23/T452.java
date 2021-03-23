import java.util.Arrays;
import java.util.Comparator;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-23 20:39
 * @Description:
 */
public class T452 {

    public int findMinArrowShots(int[][] points) {
        if(points.length == 0)
            return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int[] now = points[0];
        int result = 1;
        for (int[] interval : points) {
            if(now[1] < interval[0]){
                result ++;
                now = interval;
            }
        }
        return result;
    }
}
