package com.jspiders.DesignPattern.main;

import com.jspiders.DesignPattern.creational.SingletonEager;

public class SingletonEagerMain {

	public static void main(String[] args) {
		SingletonEager singletonEager = SingletonEager.getObject();
		System.out.println(singletonEager);
		
		 
		SingletonEager singletonEager1 = SingletonEager.getObject();
		System.out.println(singletonEager1);
	}
}
