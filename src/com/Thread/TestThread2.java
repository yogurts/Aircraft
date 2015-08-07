package com.Thread;

public class TestThread2 {
	
	public static void main(String[] args) {
		
		MyTask myTask = new MyTask(100);
		Thread t = new Thread(myTask);
		t.start();
	}

}

class MyTask implements Runnable{
	private int n;
	public MyTask(int n){
		this.n = n;
	}
	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.println(" " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
