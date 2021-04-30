public class T222 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/29 15:59
     * @Param [TreeNode]
     * @return int
     **/
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}