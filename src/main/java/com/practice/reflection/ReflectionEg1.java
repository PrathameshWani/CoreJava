package com.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
class Eagle{
	
	public String breed;
	private boolean canSwim;
	
	public void fly() {
		System.out.println("FLYING");
	}
	
	public void eat() {
		System.out.println("Eating");
		
	}
	
	private void privateMethod(String name, Boolean isBoy, int age) {
		System.out.println("Name : "+ name + "Is Boy : "+isBoy + "Age : "+age);
		
	}
	
	public void parametrise(String name, boolean isBoy, int age) {
		System.out.println("Name : "+ name + " Is Boy : "+isBoy + " Age : "+age);
		
	}
}

public class ReflectionEg1 {
	
	public static void main(String args[])  {
		
		Class eagleClass = Eagle.class;
		
		System.out.println(eagleClass.getName());
		
		Method[] methods = eagleClass.getMethods(); // It will only returns the public methods 
													// It will also returns the super class methods. As super class is Object.
		for(Method method: methods) {
			
			System.out.println("Method Name : "+method.getName());
			System.out.println("Return Type : "+method.getReturnType());
			System.out.println("Class Name : "+method.getDeclaringClass());
		}
		
		
		System.out.println("Modifiers Are : "+Modifier.toString(eagleClass.getModifiers()));
		
		// If wanted to get the all methods declared in the class(Public as well as private), check below
		// Also it will not gonna print the super class method.
		
		Method[] all = eagleClass.getDeclaredMethods();
		for (Method m : all) {
			System.out.println("Method name : "+m.getName());
		}
		
		
		// Now in reflection we can also invokes the method of the class.
		
		
		try {
			Class classEagle = Eagle.class;
			Object eagleObj = classEagle.newInstance();

			//This is non parameterise method
			Method flyMethod = classEagle.getMethod("fly");
			flyMethod.invoke(eagleObj);
			
			// Parameterise Method
			Method parameterise = classEagle.getMethod("parametrise", String.class, boolean.class, int.class);
			parameterise.invoke(eagleObj, "Prathamesh",true, 25);
			
			
			// We can also change the value of member variable, Like below.
			
			Eagle e = new Eagle();
			Field field = classEagle.getDeclaredField("breed");
			field.set(e, "Indian");
			System.out.println(e.breed);
			
			// To access Private fields 
			Field field1 = classEagle.getDeclaredField("canSwim");
			field1.setAccessible(true);
			field1.set(e, true);
			System.out.println("canSwim : "+field1.get(e));
			


		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		
		
	}

}
