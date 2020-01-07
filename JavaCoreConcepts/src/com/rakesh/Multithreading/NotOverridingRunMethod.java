package com.rakesh.Multithreading;

class Demo extends Thread {

}

public class NotOverridingRunMethod {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
		System.out.println("main method");

	}

}
//if we don't override run() inside child thread then parent(Thread class) run()
// will be executed which is empty, so we don't get any output.
