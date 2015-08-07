package com.Thread;

public class TestThread1 {
	
	public static void main(String[] args) {
		Thread t = new MyThread(100);
		t.start();
	}

}

class MyThread extends Thread{
	private int n;
	public MyThread(int n){
		super();
		this.n = n;
	}
	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.println(" " + i);
		}
	}
}