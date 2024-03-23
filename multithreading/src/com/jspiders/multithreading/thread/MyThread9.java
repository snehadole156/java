package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.MyResource1;

public class MyThread9 extends Thread {
   private MyResource1 myResource1;
   public MyThread9(MyResource1 myResource1) {
	// TODO Auto-generated constructor stub
	   this.myResource1=myResource1;
}
   @Override
	public void run() {
		myResource1.Resource();
	}
}
