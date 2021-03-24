/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-24 14:13
 * @Description:
 */
public class T725 {

    public ListNode[] splitListToParts(ListNode root, int k) {
        //统计链表总长度
        ListNode cur = root;
        int len = 0;
        while (cur != null){
            cur = cur.next;
            len ++;
        }
        //计算每段的长度
        int num = len / k;
        int front = len % k;
        //分割链表
        ListNode[] res = new ListNode[k];
        ListNode tmp = root;
        for (int i = 0; i < k && tmp != null; i++) {
            res[i] = tmp;
            int size = num + (front-- > 0 ? 1 : 0);
            for (int j = 0; j < size - 1; j++) {
                tmp = tmp.next;
            }
            ListNode next = tmp.next;
            tmp.next = null;
            tmp = next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        T725 t725 = new T725();
        ListNode[] nodes = t725.splitListToParts(node, 5);
    }
}
