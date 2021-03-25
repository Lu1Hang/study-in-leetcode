/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-25 13:03
 * @Description:
 */
public class T112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        return dfs(root, targetSum);
    }

    public boolean dfs(TreeNode root, int sum) {
        if(root == null)
            return false;
        else if(root.left == null && root.right == null){
            return root.val == sum ? true : false;
        }
        return dfs(root.left, sum - root.val) || dfs(root.right, sum - root.val);
    }
}
