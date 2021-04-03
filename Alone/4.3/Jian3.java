import java.util.ArrayList;
import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-03 19:19
 * @Description:
 */
public class Jian3 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        while (listNode != null){
            s.push(listNode.val);
            listNode = listNode.next;
        }
        while (!s.empty()){
            res.add(s.peek());
            s.pop();
        }
        return res;
    }
}
