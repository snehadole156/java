package com.jspiders.DesignPattern.creational;

public class SingletonLazy {
	private static SingletonLazy singletonLazy;
	private SingletonLazy() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor is invoke");
		
	}
	public static SingletonLazy getobject() {
		if(singletonLazy==null) {
			singletonLazy =new SingletonLazy();
			
		}
		return singletonLazy ;
	}
}
