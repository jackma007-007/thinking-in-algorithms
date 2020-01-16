package com.jpeony.algorithm.linked;

/**
 * 循环链表节点
 *
 * @author yihonglei
 */
public class LoopNode {

    // 节点内容
    int data;

    // 下一个节点
    LoopNode next = this;

    // 构造器
    public LoopNode(int data) {
        this.data = data;
    }

    /**
     * 获取下一个节点
     */
    public LoopNode next() {
        return this.next;
    }

    /**
     * 获取节点数据
     */
    public int getData() {
        return this.data;
    }

    /**
     * 插入一个节点到当前节点的后面
     */
    public void insertNode(LoopNode node) {
        // 取出下一个节点作为下下一个节点
        LoopNode nextNext = next;

        // 把新节点作为当前节点的下一个节点
        this.next = node;

        // 把下下一个节点作为新节点的下一个节点
        node.next = nextNext;
    }

    /**
     * 删除下一个节点
     */
    public void removeNext() {
        // 先取出下下一个节点
        LoopNode newNext = this.next.next;

        // 把下下一个节点设置为当前节点的下一个节点
        this.next = newNext;
    }

    // Test
    public static void main(String[] args) {
        // 创建节点
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);

        // 节点追加
        n1.insertNode(n2);

        // 取出节点值
        System.out.println("n1下一个节点：" + n1.next().getData());
        System.out.println("n2下一个节点：" + n2.next().getData());
    }
}
