package com.jspiders.multithreading.thread;

public class MyThread5 extends Thread {
    @Override
    public void run() {
    	 System.out.println("hello from MyThread5");
    	 System.out.println("id="+this.getId());
    	 System.out.println("Name="+this.getName());
    	 System.out.println("priority"+this.getPriority());
    }
}
