/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-28 13:41
 * @Description:
 */
public class T404 {

    /**
     * 左叶子节点：
     * 一个节点的左节点不为空，且左节点没有左右孩子
     * @param root
     * @return
     */
//    public int sumOfLeftLeaves(TreeNode root) {
//        if(root == null)
//            return 0;
//        int left = sumOfLeftLeaves(root.left);
//        int right = sumOfLeftLeaves(root.right);
//        int mid = 0;
//        if(root.left != null && root.left.left == null && root.left.right == null)
//            mid = root.left.val;
//        return left + right + mid;
//    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        return getResult(root, true);
    }

    public int getResult(TreeNode root, boolean flag) {
        if(root == null)
            return 0;
        if(flag && root.left == null && root.right == null)
            return root.val;
        int left = getResult(root.left, true);
        int right = getResult(root.right, false);
        return left + right;
    }
}
