package com.rakesh.Multithreading;

class Temp extends Thread {
	public void run() {
		JoinMethod j = new JoinMethod();
		j.setPriority(MAX_PRIORITY);
		System.out.println("parent --------- " + j.getPriority());
		for (int i = 1; i <= 10; i++) {
			System.out.println("child thread  " + i);
			Thread.yield();

			/*
			 * try { Thread.yield(); //Thread.sleep(200); } catch (Exception e) {
			 * e.printStackTrace(); }
			 */

		}
	}
}

public class JoinMethod extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Temp t = new Temp();
		t.start();
		// t.yield();
		// t.join(100);
		t.setPriority(MAX_PRIORITY);
		System.out.println("child ------------- " + t.getPriority());
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread  " + i);
		}
	}
}
