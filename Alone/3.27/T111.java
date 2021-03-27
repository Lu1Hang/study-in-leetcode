/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-27 13:54
 * @Description:
 */
public class T111 {

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //当前节点不是叶子节点，但是左右子树不全为空
        if(left == 0 || right == 0) return left + right + 1;
        return Math.min(left, right) + 1;
    }
}
