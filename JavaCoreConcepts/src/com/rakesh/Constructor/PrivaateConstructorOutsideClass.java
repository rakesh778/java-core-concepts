package com.rakesh.Constructor;

class DemoC {
	DemoC(String arg) {
		System.out.println("hello " + arg);
	}

	private DemoC() {
		System.out.println("DemoC constructor");
	}
}

public class PrivaateConstructorOutsideClass {

	public static void main(String[] args) {
		DemoC obj1 = new DemoC("rakesh");
		//DemoC obj2 = new DemoC();

	}

}
