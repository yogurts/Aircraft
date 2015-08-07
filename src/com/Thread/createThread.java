package com.Thread;

/**
 * @author Ita
 * 
 * 进程:一个程序的执行
 * 线程:程序中单个顺序的流控制称为线程
 * 一个进程中可以包含多个线程
 * 分享CPU(并发的或以时间片的方式)
 * 共享内存(多个线程访问同一对象)
 * 线程体--run()方法来实现
 * 线程启动后，系统自动调用run()方法
 * run()方法执行一个时间较长的操作
 */
public class createThread {
	
	/*
	 * 创建线程两种方法 
	 * 
	 */
	
}


/*
//通过继承Thread类创建线程
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(" "+i);
		}
		super.run();
	}
}



//通过向Thread()构造方法传递Runnable对象来创建线程
class MyTask implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}


//可用匿名类来实现Runnable
new Thread(){
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" "+i);
		}
		super.run();
	}
}.start();

//Lambda表达式
new Thread()->{}.start();
*/