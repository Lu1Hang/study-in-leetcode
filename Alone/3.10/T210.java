import java.util.LinkedList;
import java.util.Queue;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-10 15:19
 * @Description:
 */
public class T210 {

    /**
     * 拓扑排序
     * 1.统计每个顶点的入度
     * 2.将入度为0的顶点入队
     * 3.依次删除入度为0的顶点的所有边
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0)
            return new int[0];
        int[] indegrees = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for (int[] prerequisite : prerequisites) {
            indegrees[prerequisite[0]]++;
        }
        for (int i = 0; i < indegrees.length; i++) {
            if(indegrees[i] == 0)
                queue.offer(i);
        }
        int[] result = new int[numCourses];
        int co = 0;
        while (!queue.isEmpty()){
            Integer now = queue.poll();
            result[co ++] = now;
            for (int[] prerequisite : prerequisites) {
                if(prerequisite[1] == now){
                    indegrees[prerequisite[0]] --;
                    if(indegrees[prerequisite[0]] == 0)
                        queue.offer(prerequisite[0]);
                }
            }
        }
        if(co != numCourses)
            return new int[0];
        else
            return result;
    }

    public static void main(String[] args) {
        T210 t210 = new T210();
        int[] result = t210.findOrder(2, new int[][]{{0, 1}});
    }
}
