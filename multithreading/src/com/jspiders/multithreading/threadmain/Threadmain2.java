package com.jspiders.multithreading.threadmain;

import com.jspiders.multithreading.thread.MyThread2;

public class Threadmain2 {
     public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.start();
	}
}
