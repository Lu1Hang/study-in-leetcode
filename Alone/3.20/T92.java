/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-20 16:40
 * @Description:
 */
public class T92 {

    /**
     * 链表题要多画图理解
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode node = res;
        //找到left的上一个节点
        for (int i = 1; i < left; i++) {
            node = node.next;
        }
        //开始反转的节点(将left到right进行反转)
        ListNode tail = node.next;
        ListNode next = null;
        ListNode pre = null;
        //反转链表
        for (int i = left; i <= right; i++) {
            //记录下一个节点
            next = tail.next;
            //修改当前节点next指向
            tail.next = pre;
            //移位
            pre = tail;
            tail = next;
        }
        //连接首尾
        node.next.next = next;//在修改前这里是个循环
        node.next = pre;
        return res.next;
    }
}
