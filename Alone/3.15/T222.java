/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-15 20:23
 * @Description:
 */
public class T222 {

    /**
     * 还有更加好的方法
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
