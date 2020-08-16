package com.jpeony.algorithm.lru;

/**
 * 【算法实现】
 * 基于单链表LRU算法实现
 * 【算法思想】
 * 维护一个有序单链表，越靠近链表尾部的结点是越早之前访问的，当有一个新的数据被访问时，我们从链表头开始顺序遍历链表。
 * 1、如果此数据之前已经被缓存在链表中了，我们遍历得到这个数据对应的结点，并将其从原来的位置删除，然后再插入到链表的头部。
 * 2、如果此数据没有在缓存链表中，又可以分为两种情况：
 * .如果此时缓存未满，则将此结点直接插入到链表的头部；
 * .如果此时缓存已满，则链表尾结点删除，将新的数据结点插入链表的头部；
 *
 * @author yihonglei
 */
public class LRULinkedList<T> {
    /**
     * 默认链表容量
     */
    private final static Integer DEFAULT_CAPACITY = 10;

    /**
     * 头结点
     */
    private Node<T> head;

    /**
     * 链表长度
     */
    private Integer size;

    /**
     * 链表容量
     */
    private Integer capacity;

    public LRULinkedList() {
        this.head = new Node<>();
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
    }

    public LRULinkedList(Integer capacity) {
        this.head = new Node<>();
        this.capacity = capacity;
        this.size = 0;
    }

    /**
     * 添加元素
     */
    public void add(T data) {
        
    }

    /**
     * 头部添加
     */
    public void addFirst(T data) {

    }

    /**
     * 尾部删除元素
     */
    public void removeLast(T data) {

    }

    /**
     * 查找当前节点的上一个节点
     */
    public void findPreNode(Node<T> currentNode) {

    }

    public class Node<T> {
        private T element;

        private Node next;

        public Node() {
            this.next = null;
        }

        public Node(T element) {
            this.element = element;
        }

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
