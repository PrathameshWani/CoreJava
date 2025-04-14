package com.practice.dataencapsulation;


class SamplePojo{
	
	private String name;
	private int no;
	
	public SamplePojo(String name, int no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}
	
	
}


public class DataEncapsulations {
	public static void main(String args[]) {
	
	SamplePojo sample = new SamplePojo("Pratham", 2);
	sample.getName();
	sample.getNo();
	}
}











