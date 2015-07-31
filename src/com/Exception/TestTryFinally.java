package com.Exception;

public class TestTryFinally {
	
	static String output = "";
	
	public static void foo(int i){
		try {
			if (i == 1) {
				throw new Exception();
			}
			output += "1";
		} catch (Exception e) {
			output += "2";
			return;
		} finally {
			output += "3";
		}
		output += "4";
		
	}
	
	public static void main(String[] args) {
		foo(0);
		System.out.println(output);
		foo(1);
		System.out.println(output);
	}
	
	/*
	 * finally 无论是否有异常都要执行，即使有break，return等语句
	 * 在编译时，finally部分代码生成了多遍
	 * 
	 */

}
