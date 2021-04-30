import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-30 12:21
 * @Description:
 */
public class T513 {

    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        int res = root.val, depth = 1, size = 1, co = 0, nowd = 1;
        queue.addLast(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.pollFirst();
                if(treeNode.left == null && treeNode.right == null && nowd > depth) {
                    res = treeNode.val;
                    depth = nowd;
                    continue;
                }
                if(treeNode.left != null) {
                    queue.addLast(treeNode.left);
                    co++;
                }
                if(treeNode.right != null) {
                    queue.addLast(treeNode.right);
                    co++;
                }
            }
            size = co;
            co = 0;
            nowd++;
        }
        return res;
    }
}
