import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-07 10:32
 * @Description:
 */
public class T328 {

    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        ListNode odd = new ListNode(-1);
        ListNode oddTail = odd;
        ListNode even = new ListNode(-1);
        ListNode evenTail = even;
        boolean flag = true;
        while (head != null){
            if(flag){
                oddTail.next = head;
                oddTail = oddTail.next;
            } else {
                evenTail.next = head;
                evenTail = evenTail.next;
            }
            flag = !flag;
            head = head.next;
        }
        oddTail.next = even.next;
        evenTail.next = null;//不加这行可能会出现循环
        return odd.next;
    }
}
