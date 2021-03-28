import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-28 14:42
 * @Description:
 */
public class T739 {

    public int[] dailyTemperatures(int[] T) {
        Stack<Node> s = new Stack<>();
        int[] result = new int[T.length];
        s.push(new Node(0, T[0]));
        for (int i = 1; i < T.length; i++) {
            while (!s.empty() && T[i] > s.peek().val) {
                Node node = s.pop();
                result[node.num] = i - node.num;
            }
            s.push(new Node(i, T[i]));
        }
        while (!s.empty()) {
            result[s.pop().num] = 0;
        }
        return result;
    }

    private class Node {
        private int num;
        private int val;

        public Node(int num, int val) {
            this.num = num;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        T739 t739 = new T739();
        int[] res = t739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
