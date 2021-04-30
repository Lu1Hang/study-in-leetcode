public class T101 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/28 12:40
     * @Param [TreeNode]
     * @return boolean
     **/
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return judge(root.left, root.right);
    }

    private boolean judge(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        else if(left == null && right != null)
            return false;
        else if(left != null && right == null)
            return false;
        if(left.val != right.val)
            return false;
        return judge(left.left, right.right) && judge(left.right, right.left);
    }
}