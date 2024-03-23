package com.jspiders.multithreading.threadmain;

import com.jspiders.multithreading.thread.MyThread5;

public class Threadmain4 {
  public static void main(String[] args) {
	MyThread5 myThread5=new MyThread5();
	myThread5.setName("MyThread5");
	myThread5.setPriority(8);
	myThread5.start();
}
}
