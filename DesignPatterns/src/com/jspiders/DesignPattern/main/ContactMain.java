package com.jspiders.DesignPattern.main;

import com.jspiders.DesignPattern.creational.Contact;
import com.jspiders.DesignPattern.creational.ContactBuilder;

public class ContactMain {

	public static void main(String[] args) {

		Contact contact = new ContactBuilder().setFirstName("Ram")
				.setMobile(9877346645l).buildContact();
		System.out.println(contact);

	}

}
