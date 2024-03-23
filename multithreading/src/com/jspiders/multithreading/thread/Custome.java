package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Food;

public class Custome extends Thread {
 
	public Custome(Food food) {
		this.food=food;
	}
	private Food food;
	@Override
	public void run() {
		
      food.order();
	}

}
