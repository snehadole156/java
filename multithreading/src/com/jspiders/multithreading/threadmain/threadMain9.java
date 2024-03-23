package com.jspiders.multithreading.threadmain;

import com.jspiders.multithreading.resource.Food;
import com.jspiders.multithreading.thread.Custome;
import com.jspiders.multithreading.thread.Restaurant;

public class threadMain9 {
   public static void main(String[] args) {
	Food food=new Food();
	Custome custome=new Custome(food);
	custome.start();
	Restaurant restaurant =new Restaurant(food);
	restaurant.start();
	
}
}
