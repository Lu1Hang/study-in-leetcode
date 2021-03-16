/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-16 20:02
 * @Description:
 */
public class T226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
