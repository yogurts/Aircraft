package com.BaseClass;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ita
 * 
 * Queue队列，也是重要的线性数据结构
 * 队列遵循先进先出(First In First Out, FIF0)的原则
 * 固定在一端输入数据(入队),另一端输出数据(出队)
 * 重要的实现是LinkedList类
 * Insert  可抛出异类 add(e)  返回元素的offer(e)
 * Remove  可抛出异类 remove()  返回元素的poll()
 * Examine 可抛出异类 element()  返回元素的peek()
 */
public class TestQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			q.offer(i);
		}
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
