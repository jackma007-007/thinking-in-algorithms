package com.lanhuigu.algorithm.queue;

/**
 * 基于数组实现队列
 *
 * @author yihonglei
 */
public class MyQueue {

    // 创建数组
    int[] elements;

    // 构造方法
    public MyQueue() {
        elements = new int[0];
    }

    /**
     * 入队：在队尾插入一个元素
     *
     * @param element
     */
    public void add(int element) {
        // 定义一个新数组，长度加1
        int[] newArr = new int[elements.length + 1];

        // 把原数组元素全部挪到新数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }

        // 添加元素到新数组，即扩容1后的数组
        newArr[elements.length] = element;

        // 使用新数组替换旧数组，即使旧数组指向新数组
        elements = newArr;
    }

    /**
     * 出队：从队列中取出第一个元素
     */
    public int poll() {
        // 判断队列是否为空
        if (elements.length == 0) {
            throw new RuntimeException("Queue is empty!");
        }

        // 1、取出数组的第一个元素，即0下标对应的值
        int element = elements[0];

        // 2、干掉数组的第一个元素
        // 创建一个新数组，长度比elements小1
        int[] newArr = new int[elements.length - 1];

        // 把elements中除第一个元素外的元素放入新数组中
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }

        // 新数组替代旧数组
        elements = newArr;

        // 返回队头元素
        return element;
    }

    /**
     * 判断队列是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return elements.length == 0;
    }

    /**
     * 查看队头元素
     *
     * @return int
     */
    public int peek() {
        // 判断队列是否为空
        if (elements.length == 0) {
            throw new RuntimeException("Queue is empty!");
        }

        return elements[0];
    }

    // Test
    public static void main(String[] args) {
        // 创建队列
        MyQueue mq = new MyQueue();

        // 入队
        mq.add(1);
        mq.add(2);
        mq.add(3);

        // 查看队头元素
        System.out.println("队头元素：" + mq.peek());

        // 出队
        System.out.println("出队：" + mq.poll());
        System.out.println("出队：" + mq.poll());

        // 判断队列是否为空
        System.out.println("是否为空：" + mq.isEmpty());
    }

}
