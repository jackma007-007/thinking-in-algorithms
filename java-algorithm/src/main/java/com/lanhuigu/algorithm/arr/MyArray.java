package com.lanhuigu.algorithm.arr;

/**
 * 写一个存int的数组
 *
 * @author yihonglei
 */
public class MyArray {

    // 声明一个数组
    private int[] elements;

    // 构造器
    public MyArray() {
        elements = new int[0];
    }

    // 获取数组大小
    public int size() {
        return elements.length;
    }

    // 添加一个元素
    public void add(int element) {
        // 定义一个新数组，长度加1
        int[] newArr = new int[size() + 1];

        // 把原数组元素全部挪到新数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }

        // 添加元素到新数组，即扩容1后的数组
        newArr[elements.length] = element;

        // 使用新数组替换旧数组，即使旧数组指向新数组
        elements = newArr;
    }

    // Test
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        // size
        System.out.println(myArray.size());

        // 添加元素
        myArray.add(1);
        myArray.add(2);

        // 遍历数组
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println("myArray[" + i + "]：" + myArray.elements[i]);
        }
    }
}
