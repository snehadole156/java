package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Account;

public class AccountMain extends Thread {
    public static void main(String[] args) {
    	Account account=new Account();
		Husband husband= new Husband(account);
		Wife wife =new Wife(account);
		husband.start();
		wife.start();
	}
}
