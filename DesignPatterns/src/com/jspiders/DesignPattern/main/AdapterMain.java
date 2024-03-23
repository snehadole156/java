package com.jspiders.DesignPattern.main;

import com.jspiders.DesignPattern.creational.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		adapter adapter=new adapter();
		adapter.setName("sneha");
		adapter.womensday();
		adapter.setName("sakshi");
		adapter.mensday();
	}
}
