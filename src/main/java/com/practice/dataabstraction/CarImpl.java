package com.practice.dataabstraction;

class Car implements CarInterface{

	@Override
	public void applyBreak() {
		System.out.println("IN APPLY BREAK");
		
	}

	@Override
	public void start() {
		System.out.println("IN START METHOD");
		
	}

	@Override
	public void stop() {
		System.out.println("IN STOP METHOD");
		
	}
	
	
	
}

public class CarImpl {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.applyBreak();
		c.stop();

	}

}
