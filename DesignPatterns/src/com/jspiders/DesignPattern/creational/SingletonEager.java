package com.jspiders.DesignPattern.creational;

public class SingletonEager {

	private static SingletonEager singletonEager = new SingletonEager() ;
	private SingletonEager() {
		System.out.println("constructor is invoke");
	}
	public static SingletonEager getObject() {
		return singletonEager;
	}
}
