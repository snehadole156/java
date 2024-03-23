package com.jspiders.DesignPattern.creational;

public class adapter extends Employee implements Event {

	@Override
	public void womensday() {
		System.out.println("name of the gest"+getName());
	}

	@Override
	public void mensday() {

		System.out.println("gest is"+getName());
	}

}
