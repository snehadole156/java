package com.jspiders.multithreading.thread;

public class MyThread10 extends Thread {
     @Override
    public void run() {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("hello from Mythread10");
    		if(i==3)
    		{
    			stop();
    		}
    	}
    }
}
