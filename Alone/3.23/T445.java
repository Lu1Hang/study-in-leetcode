import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-23 19:47
 * @Description:
 */
public class T445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        ListNode tmp1 = l1, tmp2 = l2;
        while (tmp1 != null){
            s1.push(tmp1);
            tmp1 = tmp1.next;
        }
        while (tmp2 != null){
            s2.push(tmp2);
            tmp2 = tmp2.next;
        }
        ListNode res = new ListNode(-1), p1 = null, p2 = null;
        int digit = 0, now = 0;
        while (!s1.empty() || !s2.empty()){
            p1 = null;
            p2 = null;
            if(!s1.empty())
                p1 = s1.pop();
            if(!s2.empty())
                p2 = s2.pop();
            now = 0;
            if(p1 != null)
                now += p1.val;
            if(p2 != null)
                now += p2.val;
            now += digit;
            digit = now / 10;
            if(res.next == null)
                res.next = new ListNode(now % 10);
            else {
                ListNode next = res.next;
                res.next = new ListNode(now % 10);
                res.next.next = next;
            }
        }
        if(digit != 0){
            ListNode next = res.next;
            res.next = new ListNode(digit);
            res.next.next = next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        T445 t445 = new T445();
        ListNode node = t445.addTwoNumbers(l1, l2);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
