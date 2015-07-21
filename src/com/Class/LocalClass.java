package com.Class;

/**
 * @author Ita
 * 局部类：
 * 在一个方法中也可以定义类，这种类称为方法中的内部类
 * 同局部变量一样，方法中的内部类
 * 不能用public、private、protected、static修饰 但可以被final或者abstract修饰
 * 可以访问其外部类的成员
 * 不能访问该方法的局部变量、除非是final局部变量
 */
public class LocalClass {

}

class Outside{
	
	private int size = 5;
	public Object makeTheInner(int localVar){
		final int finalLocalVar = 99;
		class Inner{
			public String toString(){
				return ("InnerSize:" + size + "finalLocalVar:" + finalLocalVar);
			}
		}
	return new Inner();
	}
	
}