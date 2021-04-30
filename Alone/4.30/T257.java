import java.util.ArrayList;
import java.util.List;

public class T257 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/30 12:05
     * @Param [TreeNode]
     * @return java.util.List<java.lang.String>
     **/

    private List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return res;
        dfs(root, "");
        return res;
    }

    public void dfs(TreeNode root, String road) {
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            res.add(road + root.val);
            return;
        }
        dfs(root.left, road + root.val + "->");
        dfs(root.right, road + root.val + "->");
    }
}