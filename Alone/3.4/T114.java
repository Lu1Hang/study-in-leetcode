import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-04 10:07
 * @Description:
 */
public class T114 {

    /**
     * 前序遍历
     * @param root
     */
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        TreeNode result = new TreeNode(-1);
        while (!s.empty()){
            TreeNode node = s.pop();
            if(node.right != null)
                s.push(node.right);
            if(node.left != null)
                s.push(node.left);
            result.right = node;
            result.left = null;
            result = result.right;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
