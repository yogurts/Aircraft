package com.Polymorphism;

import java.util.Scanner;

/**
 * @author Ita
 * 对象回收由java虚拟机的垃圾回收线程来完成
 * 任何对象都有一个引用计数器、其值为0时，说明该对象可以回收
 */
public class GarbageCollection {
	
	String method(){
		String a, b;
		a = new String("Hello world");
		b = new String("Game over");
		System.out.println(a + b + "ok");
		a = null;
		a = b;
		return a;
		
	}
	
	/**
	 * System.gc()方法 是System类的static方法
	 * 它可以要求系统进行垃圾回收 但它仅仅只建议suggest
	 * 
	 */

	/*
	 * Object的finalize()有类似析构方法(destructor)的功能
	 * 系统在回收时会自动调用对象的finalize()方法
	 * protected void finalize()throws Throwable{}
	 * 子类的finalize()方法
	 * 可以在子类的finalize()方法释放系统资源
	 * 一般来说，子类的finalize()方法中应该调用父类的finalize()方法，以保证父类的清理工作能够正常进行
	 * 由于finalize()方法的调用时机并不确定，所以一般不用finalize()
	 * 关闭打开的文件、清除一些非内存资源等工作需要进行处理
	 * 可以使用try-with-resources语句
	 * 对于实现了java.lang.AutoCloseable的对象
	 */
	protected void finalize()throws Throwable{}
	
	
}
