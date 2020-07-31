package com.jpeony.algorithm.linked;

/**
 * 一个节点
 *
 * @author yihonglei
 */
public class Node {

    // 节点内容
    int data;

    // 下一个节点
    Node next;

    // 构造器
    public Node(int data) {
        this.data = data;
    }

    /**
     * 为节点追加一个节点：
     * 找到当前节点，判断当前节点是否有下一个节点，如果没有下一个节点，说明是链表的最后一个节点，
     * 然后将要追加的节点追加到链表的最后一个节点后面即可。
     */
    public Node add(Node node) {
        // 当前节点
        Node currentNode = this;

        // 循环向后找
        while (true) {
            // 取出下一个节点
            Node nextNode = currentNode.next;

            // 如果下一个节点为null，当前节点已经是最后一个节点
            if (null == nextNode) {
                break;
            }
            // 赋给当前节点
            currentNode = nextNode;
        }
        // 把需要追加的节点追加为找到的当前节点的下一个节点
        currentNode.next = node;

        return this;
    }

    /**
     * 插入一个节点到当前节点的后面
     */
    public void insertNode(Node node) {
        // 取出下一个节点作为下下一个节点
        Node nextNext = next;

        // 把新节点作为当前节点的下一个节点
        this.next = node;

        // 把下下一个节点作为新节点的下一个节点
        node.next = nextNext;
    }

    /**
     * 获取下一个节点
     */
    public Node next() {
        return this.next;
    }

    /**
     * 获取节点数据
     */
    public int getData() {
        return this.data;
    }

    /**
     * 获取当前节点是否是最后一个节点
     */
    public boolean isLast() {
        return next == null;
    }

    /**
     * 删除下一个节点
     */
    public void removeNext() {
        // 先取出下下一个节点
        Node newNext = this.next.next;

        // 把下下一个节点设置为当前节点的下一个节点
        this.next = newNext;
    }

    /**
     * 显示所有节点
     */
    public void show() {
        Node currentNode = this;
        while (true) {
            // 打印节点数据
            System.out.print(currentNode.data + " ");

            // 取出当前节点的下一个节点
            currentNode = currentNode.next;

            // 如果当前节点没有下一个节点，则表明是最后一个节点，退出循环
            if (currentNode == null) {
                break;
            }
        }
    }

    // Test
    public static void main(String[] args) {
        // 创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        // 节点追加
        n1.add(n2);
        n1.add(n3);

        // 取出节点值
        System.out.println("n1下一个节点：" + n1.next().getData());
        System.out.println("n1下一个节点的下一个节点：" + n1.next().next().getData());

        // 打印所有节点
        n1.show();

        // 删除n1的下一个节点
        n1.removeNext();

        // 打印所有节点
        n1.show();
    }
}
