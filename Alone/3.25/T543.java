/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-25 13:02
 * @Description:
 */
public class T543 {

    private int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return result;
    }

    public int getDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        result = Math.max(result, left + right);
        return Math.max(left, right) + 1;
    }
}
