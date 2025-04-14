package com.practice.polymorphism;

class Overloading{
	
	int getSum() {
		return 2 + 3;

	}
	
	int getSum(int a, int b){
		return a + b;
	}
	
	/*
	 * String getSum(int a, int b){ return "Test"; }
	 * 
	 * Method OVerriding only can be achieved with different argument.
	 * It will not work with different return type, it will gicve error.
	 */
	
	int getSum(int a, int b, int c) {
		return a+b+c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		System.out.println(obj.getSum());
		System.out.println(obj.getSum(2,5));
		System.out.println(obj.getSum(5,7,5));		

	}

}
