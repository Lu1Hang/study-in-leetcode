/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-10 11:24
 * @Description:
 */
public class T684 {

    public int[] findRedundantConnection(int[][] edges) {
        FindUnion findUnion = new FindUnion(edges.length);
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if(findUnion.isConnected(u, v)) {
                return edge;
            }
            findUnion.union(u, v);
        }
        return new int[]{-1, -1};
    }

    class FindUnion {

        private int[] father;

        FindUnion(int len) {
            father = new int[len + 1];
            for (int i = 0; i < father.length; i++) {
                father[i] = i;
            }
        }

        public int find(int x) {
            if(father[x] == x) {
                return x;
            }
            return father[x] = find(father[x]);
        }

        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }

        public void union(int x, int y) {
            father[find(x)] = find(y);
        }
    }
}
