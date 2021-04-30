import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-28 12:28
 * @Description:
 */
public class T102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        int size = 1;
        if(root == null)
            return res;
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int co = 0;
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                tmp.add(node.val);
                if(node.left != null) {
                    queue.addLast(node.left);
                    co++;
                }
                if(node.right != null) {
                    queue.addLast(node.right);
                    co++;
                }
            }
            res.add(tmp);
            size = co;
        }
        return res;
    }
}
