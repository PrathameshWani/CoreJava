package com.practice.polymorphism;

class A{
	
	void getData(){
		System.out.println("IN CLASS A getData");
	}
}

class B extends A{
	void getData() {
		System.out.println("IN CLASS B getData");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		B obj = new B();
		obj.getData();
		
		A objA = new A();
		objA.getData();

	}

}
