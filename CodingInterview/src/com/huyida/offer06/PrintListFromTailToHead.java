package com.huyida.offer06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @program: CodingInterview
 * @description: 从尾到头打印链表
 * 题目描述
 * 输入链表的第一个节点，从尾到头反过来打印出每个结点的值。
 * @author: huyida
 * @create: 2019-07-28 22:28
 **/

public class PrintListFromTailToHead {

    /**
     * @Description: 使用栈
     * @Param: [listNode]
     * @return: java.util.ArrayList<java.lang.Integer>
     * @Author: huyida
     * @Date: 2019/7/28
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.data);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    /**
     * @Description: 递归法
     * @Param: [listNode]
     * @return: java.util.ArrayList<java.lang.Integer>
     * @Author: huyida
     * @Date: 2019/8/7
     */
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode != null) {
            arrayList.addAll(printListFromTailToHead1(listNode.next));
            arrayList.add(listNode.data);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        System.out.println(printListFromTailToHead(listNode).toString());

    }

}
