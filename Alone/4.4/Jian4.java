/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-04 17:18
 * @Description:
 */
public class Jian4 {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0)
            return null;
        TreeNode result = buildTree(pre, in, 0, pre.length, 0, in.length);
        return result;
    }

    public TreeNode buildTree(int[] pre, int[] in, int pl, int pr, int vl, int vr) {
        //两边不能重合
        if(pl == pr)
            return null;
        //取出前序序列第一个
        int target = pre[pl], pos = -1;
        //在中序序列中找到其位置
        for (int i = vl; i <= vr; i++) {
            if(in[i] == target){
                pos = i;
                break;
            }
        }
        //递归处理
        TreeNode now = new TreeNode(target);
        //前序和中序序列中子节点的数量相同
        now.left = buildTree(pre, in, pl + 1, pl + 1 + pos - vl, vl, pos);
        now.right = buildTree(pre, in, pl + 1 + pos - vl, pr, pos + 1, vr);
        return now;
    }
}
