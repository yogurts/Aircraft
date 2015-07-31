package com.BaseClass;

/**
 * @author lili.sun
 * 
 * 字符串分为两大类
 * String类：创建之后不会再做修改和变动  即immutable
 * StringBuffer、StringBuilder类：创建之后允许再做更改和变化  非线程安全
 * 在循环中 使用String的+=可能会带来效率问题
 */
public class StringAndStringBuffer {

	public static void main(String[] args) {
		String s = "";
		StringBuffer sb = new StringBuffer();
		
		final int N = 10000;
		
		long t0 = System.currentTimeMillis();
		for (int i = 0; i < N; i++) s += "a";		
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < N; i++) sb.append("a");		
		long t2 = System.currentTimeMillis();
	
		System.out.println(t1);
		System.out.println(t1 - t2);
		System.out.println(t2 - t1);
		
	}
}
