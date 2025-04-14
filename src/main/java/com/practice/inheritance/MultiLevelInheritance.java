package com.practice.inheritance;


class GrandFather{
	long money = 100;
	
	long getMoney() {
		System.out.println("IN GRANDFATHER getMoney");
		return money;
	}
}

class Parents extends GrandFather {
	
	String skills = "Cycling";
	
	String getSkills() {
		System.out.println("IN PARENTS GET SKILLS");
		return skills;
	}
	
}


class Childs extends Parents{
	
	/*
	 * Variables from Parent class can not be access without methods, access it like
	 * below.
	 */
	
	long getMoney() {
		money = money + 100;
		System.out.println("IN Childs getMonry");
		return money;
	}
	
	String getSkills() {
		skills = skills.concat("NerSkills");
		System.out.println("IN Child Get Skills");
		return skills;
	}
	
	
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		Childs c = new Childs();
		System.out.println(c.getMoney());
		System.out.println(c.getSkills());

	}

}
