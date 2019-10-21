package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: Java
 * @description: printListFromTailToHead
 * @author: huyida
 * @create: 2019-02-12 22:48
 **/

public class PrintListFromTailToHead {

    /**
     * 使用栈
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty())
            ret.add(stack.pop());
        return ret;
    }

    /**
     * 使用递归
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    /**
     * 使用头插法
     * 利用链表头插法为逆序的特点。
     * 头结点和第一个节点的区别:
     * 头结点是在头插法中使用的一个额外节点，这个节点不存储值; 第一个节点就是链表的第一个真正存储值的节点。
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        // 头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(printListFromTailToHead(listNode).toString());
    }
}


class ListNode {
    public int val;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int val) {
        this(val, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}