package com.jpeony.algorithm.linked;

/**
 * 双链表
 *
 * @author yihonglei
 */
public class DoubleNode {
    // 上一个节点
    DoubleNode pre = this;

    // 下一个节点
    DoubleNode next = this;

    // 节点数据
    int data;

    /**
     * 构造方法
     */
    public DoubleNode(int data) {
        this.data = data;
    }

    /**
     * 增加节点
     */
    public void after(DoubleNode node) {
        // 原来的下一个节点
        DoubleNode nextNext = next;
        // 把新节点作为当前节点的下一个节点
        this.next = node;
        // 当前节点作为新节点的前一个节点
        node.pre = this;
        // 让原来的下一个节点作为新节点的下一个节点
        node.next = nextNext;
        // 让原来的下一个节点的上一个节点为新节点
        nextNext.pre = node;
    }

    /**
     * 获取下一个节点
     */
    public DoubleNode next() {
        return this.next;
    }

    /**
     * 获取上一个节点
     */
    public DoubleNode pre() {
        return this.pre;
    }

    /**
     * 获取节点数据
     */
    public int getData() {
        return data;
    }

    // 测试
    public static void main(String[] args) {
        // 创建节点
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);

        // 打印n1的上下节点，n1此时没有追加节点，其节点与上下节点一样
        System.out.println(n1.next.getData());
        System.out.println(n1.getData());
        System.out.println(n1.pre.getData());

        // 追加节点
        n1.after(n2);
        n2.after(n3);

        // 打印n2节点及上下节点内容
        System.out.println(n2.pre.getData());
        System.out.println(n2.getData());
        System.out.println(n2.next.getData());
    }
}
