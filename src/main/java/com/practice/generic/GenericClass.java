package com.practice.generic;

// Used To avoid type casting 
// Like. If i have take the variable as Object Value; Now i can insert any value in object.
// As Object class is parent object of all data types classes.
class Print<T> {

	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

public class GenericClass {

	public static void main(String args[]) {
		Print<Integer> i = new Print<Integer>();
		i.setValue(10);
		System.out.println("Integer is :: "+i.getValue());
		
		
		Print<String> string = new Print<String>();
		string.setValue("Prathamesh");
		System.out.println("String is :: "+string.getValue());
		
	}
}





