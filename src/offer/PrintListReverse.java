package offer;

import java.util.Stack;

/**
 * Created by lps on 2017/6/29.13:46
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 */
public class PrintListReverse {
    static class ListNode {
        int data;
        ListNode next;
    }

    public static void main(String[] args) {
        ListNode node1, node2, node3;
        node1 = new ListNode();
        node3 = new ListNode();
        node2 = new ListNode();
        node1.data = 1;
        node1.next = node2;
        node2.data = 2;
        node2.next = node3;
        node3.data = 3;
//        printLIstreverse(node1);
        printListReverse(node1);
    }

    /**
     * 解法1 递归
     *
     * @param headnode
     */
    public static void printLIstreverse(ListNode headnode) {
        Stack<ListNode> stack = new Stack<>();
        while (headnode != null) {
            stack.push(headnode);
            headnode = headnode.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().data);
        }
    }

    /**
     * 递归方式实现
     * @param head
     */
    public static void printListReverse(ListNode head) {
        if (head != null) {
            if (head.next != null) printListReverse(head.next);
            System.out.println(head.data);
        }
    }
}
