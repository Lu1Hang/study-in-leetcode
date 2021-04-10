/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-10 10:24
 * @Description:
 */
public class T785 {

    /**
     * @Author Alone
     * @Description 判断二分图
     * @Date  2021/4/10 10:24
     * @Param [int[][]]
     * @return boolean
     **/
    public boolean isBipartite(int[][] graph) {
        FindUnion findUnion = new FindUnion(graph.length);
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if(findUnion.isConnected(i, graph[i][j])) {
                    return false;
                }
                findUnion.union(graph[i][0], graph[i][j]);//是要所有与i的邻接点同一颜色，但i与他们不同色
            }
        }
        return true;
    }

    class FindUnion {

        private int[] degrees;

        FindUnion(int len) {
            this.degrees = new int[len];
            for (int i = 0; i < len; i++) {
                degrees[i] = i;
            }
        }

        public int find(int x) {
            if(degrees[x] == x)
                return x;
            else
                return degrees[x] = find(degrees[x]);
        }

        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }

        public void union(int x, int y) {
            degrees[find(x)] = find(y);
        }
    }
}
