package com.company;

class MyThread extends Thread{

    @Override
    public void run() {
        while(true) {
            synchronized (System.out) {
                System.out.notify();
                try {
                    System.out.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName());
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
