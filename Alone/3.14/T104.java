/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-14 19:32
 * @Description:
 */
public class T104 {

    private int ans = 0;

    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    public void dfs(TreeNode root, int depth){
        if(root == null){
            ans = Math.max(ans, depth);
            return;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
