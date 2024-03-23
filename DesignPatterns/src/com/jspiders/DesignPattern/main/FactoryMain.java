package com.jspiders.DesignPattern.main;

import java.util.Scanner;

import com.jspiders.DesignPattern.creational.Beverage;
import com.jspiders.DesignPattern.creational.GingerTea;
import com.jspiders.DesignPattern.creational.GreenTea;
import com.jspiders.DesignPattern.creational.LeamonTea;
import com.jspiders.DesignPattern.creational.MasalaTea;

public class FactoryMain {
	private static Beverage factory() {
	     Beverage  beverage=null;
		System.out.println("enter 1 to order masala tea\n"
				+"Enter 2 to order lemon tea\n"+"Enter 3 to order Greentea\n"+"enter 4 to ginger tea");
		System.out.println("Enter your choice");
		Scanner scanner=new Scanner(System.in);
	    int choice= scanner.nextInt();
	    scanner.close();
	    switch (choice) {
		case 1:
			beverage=new MasalaTea();
			break;
		case 2:
			beverage=new LeamonTea();
			break;
		case 3:
			beverage=new GreenTea();
			break;
		case 4:
			beverage= new GingerTea();
			break;

		default:
			System.out.println("invalid choice");
		}
	    return beverage;
	}
public static void main(String[] args) {
	try{
		factory().order();
	}
	catch(NullPointerException e) {
		System.out.println("no tea is ordered");
	}
	}
}

