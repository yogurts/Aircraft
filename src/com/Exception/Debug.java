package com.Exception;

/**
 * @author Ita
 * 
 * 断点    切换断点(toggle breakpoint)  Ctrl+Shift+B
 * 
 * 跟踪:
 * 逐句执行 F5
 * 逐过程执行 F6
 * 跳出函数 F7
 * 运行到光标处 Ctrl + R
 * 
 * 即时监视  鼠标指向变量     快速监视 点右键 Inspector 添加监视 点右键 Watch
 *
 */
public class Debug {
	
	public static void main(String[] args) {
		int[] ary = {1,3,5,10};
		int total = sum(ary);
		System.out.println(total);
	}

	private static int sum(int[] a) {
		
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	
}
