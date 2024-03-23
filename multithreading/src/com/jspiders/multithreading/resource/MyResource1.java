package com.jspiders.multithreading.resource;

public class MyResource1 {
     public void Resource() {
    	 System.out.println("lock is applied on Resource by"+Thread.currentThread().getName());
     }
}
