package com.practice.inheritance;

import java.util.Arrays;

class Parent {
	
	long money = 10000;
	String[] skills = {"Badminton", "Cricket"};
	String[] estate = {"1BHK","2BHK"};
}

class Child extends Parent{
	
	public long getMoney() {
		return money;
	}
	
	public String[] getSkills() {
		return skills;
	}
	
	public String[] getEstate(){
		return estate;
	}
	
	
}


public class SingleInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("Money Is : "+c.getMoney());
		System.out.println("Money Is : "+Arrays.toString(c.getSkills()));
		System.out.println("Money Is : "+Arrays.toString(c.getSkills()));

	}

}
