/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-02-28 09:30
 * @Description:
 */
public class T236 {

    /**
     * T236 最近公共祖先LCA
     * 若root是p,q的最近公共祖先，则只可能为以下情况之一:
     * 1.p和q在root的子树中,且分列root的异侧
     * 2.p = root,且q在root的左或右子树中
     * 3.q = root,且p在root的左或右子树中
     *
     * 通过递归对二叉树进行后序遍历,当遇到节点p或q时返回.从底至顶回溯，当节点p，q在节点root的异侧时，
     * 节点root即为最近公共祖先,则向上返回root
     *
     * 返回值： 根据 left 和 right ，可展开为四种情况；
     * 1.当 left 和 right 同时为空 ：说明 root 的左 / 右子树中都不包含 p,q ，返回 null ；
     * 2.当 left 和 right 同时不为空 ：说明 p,q 分列在 root 的 异侧 （分别在 左 / 右子树），因此 root 为最近公共祖先，返回 root ；
     * 3.当 left 为空 ，right 不为空 ：p,q 都不在 root 的左子树中，直接返回 right 。具体可分为两种情况：
     * p,q 其中一个在 root 的 右子树 中，此时 right 指向 p（假设为 p ）；
     * p,q 两节点都在 root 的 右子树 中，此时的 right 指向 最近公共祖先节点 ；
     * 4.当 left 不为空 ， right 为空 ：与情况 3. 同理；
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null)
            return null;
        else if(left != null && right != null)
            return root;
        else
            return left == null ? right : left;
    }
}
