package com.jspiders.DesignPattern.main;

import com.jspiders.DesignPattern.creational.SingletonLazy;

public class SingletonLazyMain {

	public static void main(String[] args) {
		SingletonLazy singletonLazy =SingletonLazy.getobject();
		System.out.println(singletonLazy);
		
		
		SingletonLazy  singletonLazy2=SingletonLazy.getobject();
		System.out.println( singletonLazy);
	}
}
