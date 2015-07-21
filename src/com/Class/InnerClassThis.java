package com.Class;

/**
 * @author Ita
 * 内部类中可以直接访问外部类的字段及方法 即使private也可以
 * 如果内部类中有与外部类同名的字段或方法，则可以用外部类名.this.字段及方法
 *
 */
public class InnerClassThis {

	public static void main(String[] args) {
		A a = new A();
		A.B ab = a.new B();
		ab.mb(333);
	}
}

class A{
	private int s = 111;
	
	public class B{
		private int s = 222;
		public void mb(int s){
			System.out.println(s); //局部变量
			System.out.println(this.s); //内部类对象的属性s
			System.out.println(A.this.s); //外层类对象属性s
		}
	}
}