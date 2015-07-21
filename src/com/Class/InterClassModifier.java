package com.Class;

/**
 * @author Ita
 * 内部类与类中的字段、方法一样是外部类的成员，它的前面也可以有访问修饰符和其他修饰符
 * 访问修饰符public、protected、默认及private、final,abstract
 * 外部类只能够使用public修饰或者默认
 * 
 */
public class InterClassModifier {
	
	/*
	 * static修饰内部类，表明该类实际是一种外部类、它与外部类的实例无关 实际属于外部类
	 * 1.实例化static类时，在new前面不需要用对象实例变量
	 * 2.static类中不能访问其外部类的非static的字段及方法，即只能访问static成员
	 * 3.static方法中不能访问非static的域及方法，也不能不带前缀的new一个非static的内部类
	 * 
	 */

}
