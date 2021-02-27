import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-02-27 14:17
 * @Description:
 */
public class T207 {

    /**
     * T207 课程表
     * 使用拓扑排序判断是否为有向无环图
     * 拓扑排序的步骤：
     * 1.统计每个节点的入度
     * 2.将所有入度为0的点入队
     * 3.当队列非空时，依次将队首节点出队，将所有邻接节点的入度-1，当入度-1后邻接节点cur入度为0，则将cur入队
     * 4.每次出队时将总节点数-1，如果最后总节点数为0，则没有环
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();//图
        int[] indegrees = new int[numCourses];//入度表
        Queue<Integer> queue = new LinkedList<>();//队列
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        //统计入度并构建图
        for (int i = 0; i < prerequisites.length; i++) {
            indegrees[prerequisites[i][0]] ++;
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if(indegrees[i] == 0)
                queue.add(i);
        }
        while(!queue.isEmpty()) {
            int pos = queue.poll();
            numCourses --;
            for (Integer cur : graph.get(pos)) {
                if(--indegrees[cur] == 0)
                    queue.add(cur);
            }
        }
        return numCourses == 0;
    }
}
