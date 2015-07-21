package com.Polymorphism;

import java.awt.Shape;

/** 
 * @author Ita
 * 
 * 多态Polymorphism是一个程序中相同的名字表示不同的含义的情况
 * 多态有两种情形
 * 编译时多态： 重载(overload) 多个同名的不同方法 p.sayHello(); p.sayHello("Wang");
 * 运行时多态: 
 * 覆盖(override) 子类对父类方法进行覆盖
 * 动态绑定(dynamic binding) 虚方法调用(virtual method invoking)
 * 在调用方法时，程序会正确地调用子类对象的方法
 * 
 * 上溯造型(upcasting) 把派生类型当做基本类型处理
 * Person p = new Student();
 * void fun(Person p){}   fun(new Person());  fun(new Student());
 * @param <Circle>
 */

public class TestVirtualInvoke {
	
	/*
	 * 用虚方法调用，可以实现运行时的多态
	 * 子类重载了父类方法时，运行时系统根据调用方法的实例的类型来决定选择哪个方法调用
	 * 所有的非final方法都会自动地进行动态绑定
	 * 
	 */
	
	static void doStuff(Shape s) {
		s.draw();
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		Triangle t = new Triangle();
		Line l = new Line();
		
		doStuff(c);
		doStuff(t);
		doStuff(l);
	}	

		
	public static class Shape {
			void draw(){
				System.out.println("Shape Drawing");
			}
		}
		
	public static class Circle extends Shape{
		void draw(){
				System.out.println("Draw Circle");
			}
		}
		
	public static class Triangle extends Shape{
			void draw(){
				System.out.println("Draw Triangle");
			}
		}
		
	public static class Line extends Shape{
			void draw(){
				System.out.println("Draw Line");
			}
		}

	//原来我写的内部类是动态的，也就是开头以public class开头。而主程序是public static class main。在Java中，类中的静态方法不能直接调用动态方法。只有将某个内部类修饰为静态类，然后才能够在静态类中调用该类的成员变量与成员方法。所以在不做其他变动的情况下，最简单的解决办法是将public class改为public static class.
}
