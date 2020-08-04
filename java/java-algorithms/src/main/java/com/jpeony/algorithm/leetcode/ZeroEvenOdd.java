package com.jpeony.algorithm.leetcode;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @author yihonglei
 */
public class ZeroEvenOdd {
    private int n;
    private Semaphore semaZero = new Semaphore(1);
    private Semaphore semaOdd = new Semaphore(2);
    private Semaphore semaEven = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            semaZero.acquire();
            printNumber.accept(0);
            semaOdd.release();
            semaEven.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

    }
}
