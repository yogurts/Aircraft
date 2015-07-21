package com.Class;

import javax.print.attribute.standard.Destination;

/**
 * @author Ita
 * 内部类的定义：
 * 将类的定义class xxx{} 置入一个类的内部即可
 * 编译器生成xxx$xxx这样的class文件
 * 内部类不能够与外部类同名
 */
public class InnerClass {
	
	/*
	 * 内部类的使用：
	 * 在封装它的类的内部使用内部类，与普通类的使用方式相同
	 * 在其他地方使用：雷鸣要冠以外部类的名字；在用new创建内部类时也要在new前面冠以对象变量
	 * 外部类对象名.new.内部类名(参数) 
	 * 
	 */
	
	public static void main(String[] args) {
		Parcel p = new Parcel();
		p.testShip();
		
		Parcel.Contents c = p.new Contents(33);
		Parcel.Destination d = p.new Destination("Hawaii");
		p.setProperty(c, d);
		p.ship();
	}

}

	class Parcel{
		private Contents c;
		private Destination d;
		class Contents{
			private int i;
			Contents(int i) {this.i = i;}
			int value() {return i;}
	}
	
	class Destination{
		private String label;
		Destination(String whereTo) {label = whereTo;}
		String readLabel() {return label;}
	}
	
	void setProperty(Contents c, Destination d){
		this.c = c;
		this.d = d;
	}
	
	void ship(){
		System.out.println("move" + c.value() + "to" + d.readLabel()); 
	}
	
	public void testShip(){
		c = new Contents(22);
		d = new Destination("Berlin");
		ship();
	}
}
