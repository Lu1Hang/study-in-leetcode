/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-24 14:34
 * @Description:
 */
public class T110 {

    public boolean isBalanced(TreeNode root) {
        return getDepth(root) == -1 ? false : true;
    }

    public int getDepth(TreeNode root){
        if(root == null)
            return 0;
        int left = getDepth(root.left);
        if(left == -1)
            return -1;
        int right = getDepth(root.right);
        if(right == -1)
            return -1;
        return Math.abs(left - right) < 2 ? 1 + Math.max(left, right) : -1;
    }
}
