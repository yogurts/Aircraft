package com.Class;

/**
 * @author Ita
 * 匿名类是一种特殊的内部类，它没有类名，在定义类的同时就生成该对象的一个实例
 * 一次性使用的类
 * 匿名类的应用
 * 用到界面的事件处理 注册一个事件监听器；作为方法的参数 如排序 给一个比较大小的接口
 * 
 */
public class AnonymousClass {

}

class OutsideA{
	
	private int size = 5;
	public Object makeTheInner(int localVar){
		final int finalLocalVar = 99;
		/*
		 * 1、不取名字 直接用其父类或接口的名字
		 * 该类是父类的子类 或者实现了一个接口
		 * 编译器生成xxxx$1之类的名字
		 * 2、类的定义的同时就创建实例、类的定义前面有一个new
		 * new类名或接口名(){...}
		 * 不使用关键词class 也不使用extends及implements
		 * 3、在构造对象时使用父类的构造方法
		 * 不能够定义构造方法、因为它没有名字
		 * 如果new对象时 要带参数 则使用父类的构造方法
		 * 
		 */
		return new Object(){
			public String toString(){
				return ("InnerSize:" + size + "finalLocalVar:" + finalLocalVar);
			}
		};
	}
	
}