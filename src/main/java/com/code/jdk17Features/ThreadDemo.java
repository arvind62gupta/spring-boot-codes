package com.code.jdk17Features;

public class ThreadDemo extends  Thread{

    private static final Object lock = new Object();
    private static boolean thread1Turn = true;
    public static void main(String[] args){

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                synchronized (lock) {
                    while (!thread1Turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Thread1:" + i);
                    thread1Turn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                synchronized (lock) {
                    while (thread1Turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Thread2:" + i);
                    thread1Turn = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
