package com.Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Ita
 * 异常exception 又称为例外、差错、违例
 * 对应着java运行错误处理机制 
 */
public class ExceptionForNum {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input a number:");
			String s = in.readLine();
			int n = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
            System.out.println("请你输入正确正数！");  
            System.out.println("错误是：" + e.getMessage());  
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("-----" + e.getMessage());  
		} 
	}
	
	
	/*
	 但是要注意catch语句的顺序，如果catch要捕获的异常是同一种异常或者说是存在继承关系，
	 则要将捕获子类异常的语句放在前边，否则编译的时候会出错。
	 catch (Exception e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	Unreachable catch block for NumberFormatException. 
	It is already handled by the catch block for Exception	
	 */
}
