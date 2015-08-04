package com.BaseClass;

import java.util.Stack;

/**
 * @author Ita
 *
 * Stack栈  遵循"后进先出" (Last In First Out, LIFO) 原则
 * 重要线性数据结构
 * 包含三个方法
 * public Object push(Object item):将指定对象压入栈中
 * public Object pop():将栈最上面的元素从栈中取出，并返回这个对象
 * public boolean empty():判断栈中没有对象元素
 */
public class TestStack {

	static String[] months = {
		"January", "February", "March", "April",
		"May", "June", "July", "August", "September",
		"October", "November", "December" };
	
	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		for (int i = 0; i < months.length; i++) {
			stk.push(months[i] + " ");
		}
		System.out.println("stk = " + stk);
		System.out.println("popping elements:");
		while (!stk.empty()) {
			System.out.println(stk.pop());
		}
	}
}
