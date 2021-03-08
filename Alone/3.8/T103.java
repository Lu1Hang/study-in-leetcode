import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-08 14:19
 * @Description:
 */
public class T103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<TreeNode> s1 = new Stack<>();//从左往右
        Stack<TreeNode> s2 = new Stack<>();//从右往左
        s1.push(root);
        while (!s1.empty() || !s2.empty()){
            List<Integer> tmp = new ArrayList<>();
            if(!s1.empty()){
                while (!s1.empty()){
                    TreeNode node = s1.pop();
                    tmp.add(node.val);
                    if(node.left != null)
                        s2.push(node.left);
                    if(node.right != null)
                        s2.push(node.right);
                }
            } else if(!s2.empty()){
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    tmp.add(node.val);
                    if(node.right != null)
                        s1.push(node.right);
                    if(node.left != null)
                        s1.push(node.left);
                }
            }
            res.add(tmp);
        }
        return res;
    }

    class TreeNode {
        int val;
        T103.TreeNode left;
        T103.TreeNode right;
        TreeNode(){}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, T103.TreeNode left, T103.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
