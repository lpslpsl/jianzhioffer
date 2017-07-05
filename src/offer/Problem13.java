package offer;

/**
 * Created by lps on 2017/7/5.9:35
 * 给定单向链表的头指针和一个结点指针，定义一个函数在 O(1)时间删除
 * 该结点。
 */
public class Problem13 {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode thrid = new ListNode();
        head.nextNode = second;
        second.nextNode = thrid;
        head.data = 1;
        second.data = 2;
        thrid.data = 3;
        deleteNode(head, head);
        System.out.println(head);

    }

    private static void deleteNode(ListNode head, ListNode deleteNode) {
        if (head == null || deleteNode == null) return;
        if (head == deleteNode) head = null;
        else {
            if (deleteNode.nextNode == null)//如果被删除的是尾结点
            {
                ListNode pointListNode = head;
                while (pointListNode.nextNode.nextNode != null) {
                    pointListNode = pointListNode.nextNode;//节点后移
                }
                pointListNode.nextNode = null;//尾结点置为空
            } else {//不是尾结点则将要被删除的这个节点的值和nextnode都赋为下一个节点的
                deleteNode.data = deleteNode.nextNode.data;
                deleteNode.nextNode = deleteNode.nextNode.nextNode;
            }
        }
    }

    static class ListNode {
        int data;
        ListNode nextNode;

        @Override
        public String toString() {
            return "ListNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }
}
