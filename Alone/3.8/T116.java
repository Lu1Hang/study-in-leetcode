/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-08 14:49
 * @Description:
 */
public class T116 {

    public Node connect(Node root) {
        dfs(root, null);
        return root;
    }

    public void dfs(Node node, Node next){
        if(node != null) {
            node.next = next;
            dfs(node.left, node.right);
            dfs(node.right, node.next == null ? null : node.next.left);
        }
    }
}


// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
