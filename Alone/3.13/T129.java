/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-13 19:52
 * @Description:
 */
public class T129 {

    private int result = 0;

    public int sumNumbers(TreeNode root) {
        result = 0;
        if(root == null)
            return result;
        dfs(root, 0);
        return result;
    }

    public void dfs(TreeNode root, int val){
        if(root == null){
            return;
        }
        val = val * 10 + root.val;
        if(root.left == null && root.right == null){
            result += val;
            return;
        }
        dfs(root.left, val);
        dfs(root.right, val);
    }
}
