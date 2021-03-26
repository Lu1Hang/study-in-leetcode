import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-26 18:26
 * @Description:
 */
public class T406 {

    /**
     * 总结起来是矮的人不影响高的人的排序
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
        //将数组先按h排序,再按k排序
        Arrays.sort(people, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : (o2[0] - o1[0])));
        List<int[]> list = new LinkedList<>();
        //按k插入
        for (int[] person : people) {
            list.add(person[1], person);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
