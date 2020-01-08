package com.rakesh.Constructor;

public class PrivateConstructorInsideSameClass {
	private PrivateConstructorInsideSameClass() {
		System.out.println("inside private Constructor");
	}

	public void demo() {
		System.out.println("demo method");
	}

	public static void main(String[] args) {
		PrivateConstructorInsideSameClass obj = new PrivateConstructorInsideSameClass();
		obj.demo();	

	}

}
