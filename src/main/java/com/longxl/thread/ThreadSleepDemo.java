package com.longxl.thread;

/**
 * sleep() 方法的作用是在指定的毫秒数内让当前“正在执行的线程”休眠（暂停执行）。这个“正在执行的线程”是指Thread.currentThread() 返回的线程。所以主线程的时间并不会因为线程的休眠而受到影响。
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("currentThreadName:"+currentThreadName);
        MyThread mythread = new MyThread();
        long starttime = System.currentTimeMillis();
        System.out.println("主线程开始时间=" + starttime);
        mythread.start();
        long endtime = System.currentTimeMillis();
        System.out.println("主线程结束时间=" + endtime);
        System.out.println("主线程时间差=" + (endtime - starttime));

//        输出：
//        currentThreadName:main
//        主线程开始时间=1648281852278
//        主线程结束时间=1648281852345
//        主线程时间差=67
//        Thread-0 开始时间=1648281852354
//        Thread-0 结束时间=1648281854379
//        时间差=2025
    }

    /**
     * 可以看出，主线程不存在Thread.currentThread()，也没有休眠时间，所以并不会受到sleep（）的影响(主线程如加sleep操作，影响是的主线程的休眠)。而线程Thread-0因为有休眠，所以它存在延时现象。
     */
    static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                long starttime = System.currentTimeMillis();
                System.out.println(Thread.currentThread().getName() + " 开始时间=" + System.currentTimeMillis());
                Thread.sleep(2000); // 延时2秒
                long endtime = System.currentTimeMillis();
                System.out.println(Thread.currentThread().getName() + " 结束时间=" + System.currentTimeMillis());
                System.out.println("时间差=" + (endtime - starttime));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
