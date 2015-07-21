package com.Polymorphism;
/** 
 * @author Ita
 * 
 * static方法，以声明的类型为准，与实例类型无关
 * private方法子类看不见, 也不会被虚化
 * final方法子类不能覆盖，也不存在虚化问题
 * 
 */
public class JavaP3methods {
	
	void f(){}
	private void p(){}
	static void s(){}
	
	public static void main(String[] args) {
		JavaP3methods obj = new JavaP3methods();
		obj.f();
		obj.p();
		obj.s();
	}

}
