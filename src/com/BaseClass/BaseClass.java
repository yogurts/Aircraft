package com.BaseClass;

import java.awt.print.Printable;
import java.util.Enumeration;
import java.util.Properties;


/**
 * @author Ita
 * 
 * Java基础类库
 * Java.lang  Java语言的核心类库 java是自动导入java.lang.*的
 * java.util 实用工具
 * java.io 标准输入/输出类库
 * java.awt javax.swing 图形用户界面(GUI)的类库
 * java.net 网络功能的类库
 * java.sql 数据库访问的类库
 * JDK源码 src.zip   Java\jdk\下
 * 
 * Math类用来完成一些常用的数学运算
 * System 系统属性可以通过环境变量来获得
 * 
 *
 */

public class BaseClass {

	
	/*
	 * "=="是引用是否相等,equals是内容(含义)相等
	 * 
	 */
	
	public static void main(String[] args) {
		
		Integer one = new Integer(1);
		Integer anotherOne = new Integer(1);
		Integer two = one;
		if (one == anotherOne) {
			System.out.println("是同一个引用");
		}
		if (one.equals(anotherOne)) {
			System.out.println("one和anotherOne内容相等");
		}
		if (one == two) {
			System.out.println("one和two是同一个引用");
		}
		
		BaseClass bc = new BaseClass();
		bc.PrintClassName(10);
		bc.PrintClassName('a');
		bc.PrintClassName("grace");
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.NaN);
		System.out.println(Double.POSITIVE_INFINITY);
		
		//Integer I = 5; 即 I = Integer.valueOf(5);  基本类型包装为引用类型 boxing 包装
		//int i = I;  即 i = I.intValue();  引用类型变为基本类型 unboxing 拆包
		
		System.out.println(Math.E); 
		System.out.println(Math.PI); //圆周率常量
		System.out.println(Math.abs(-66));  //绝对值
		System.out.println(Math.exp(3));  //参数次幂   e的3次幂
		System.out.println(Math.floor(11.8));  //不大于参数的最大整数
		System.out.println(Math.IEEEremainder(20, 8));  //求余
		System.out.println(Math.log(3));  //自然对数
		System.out.println(Math.max(100, 200));  //最大值
		System.out.println(Math.min(100, 130));  //最小值
		System.out.println(Math.pow(2, 3));  //乘方
		System.out.println(Math.random());  //产生0和1(不含1)之间的伪随机数
		System.out.println(Math.rint(5.6));  //四舍五入
		System.out.println(Math.sqrt(4));  //平方根
		
		System.out.println(System.getProperties()); //包含了所有可用的系统属性信息
		System.out.println(System.getProperty("java.runtime.name")); //获得特定的系统属性值
		
		Properties props = System.getProperties();
		Enumeration keys = props.propertyNames();
		while (keys.hasMoreElements()) {
			java.lang.String key = (java.lang.String) keys.nextElement();
			System.out.println(key + " = " + props.getProperty(key));
		}
		
		
	}
	

	void PrintClassName(Object obj){
		System.out.println("The object's class is" + obj.getClass().getName());
	}

	Object creatNewInstanceOf(Object obj) throws InstantiationException, IllegalAccessException{
		return obj.getClass().newInstance();
	}
}

