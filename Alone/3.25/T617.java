/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-25 13:03
 * @Description:
 */
public class T617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null)
            return root1 == null ? root2 : root1;
        return dfs(root1, root2);
    }

    public TreeNode dfs(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null)
            return root1 == null ? root2 : root1;
        root1.val += root2.val;
        root1.left = dfs(root1.left, root2.left);
        root1.right = dfs(root1.right, root2.right);
        return root1;
    }
}
