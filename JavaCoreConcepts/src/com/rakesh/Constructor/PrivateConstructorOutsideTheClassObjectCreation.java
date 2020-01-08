package com.rakesh.Constructor;

class Outer {
	public static Outer OuterObj = null;

	private Outer() {
		System.out.println("Outer Class private Constructor");
	}

	public static Outer MethodForObjCreation() {
		System.out.println("Outer class Demo method");
		if (OuterObj == null) {
           OuterObj = new Outer();
		}
		return OuterObj;
	}
}

public class PrivateConstructorOutsideTheClassObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = Outer.MethodForObjCreation();

	}

}
