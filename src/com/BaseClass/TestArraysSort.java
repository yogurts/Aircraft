package com.BaseClass;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Ita
 * 
 * 排序与查找
 * 自编程序排序与查找：冒泡排序、选择排序、快速排序
 * 系统已有的排序与查找  Arrays类及Collections类
 * Arrays类是用于对数组进行排序和搜索的类
 * Arrays.asList(10,7,6,5,9)方法可以直接得到一个List对象
 * Arrays类提供了sort()和binarySearch()
 * 执行binarySearch()之前应调用sort()
 */
public class TestArraysSort {

	static Random r = new Random();
	static String ssource = 
		    "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
		    	    "abcdefghijklmnopqrstuvwxyz";
	static char[] src = ssource.toCharArray();
	//Create a random String
	
	private static String randStrings(int length) {
		char[] buf = new char[length];
		int rnd;
		for (int i = 0; i < length; i++) {
			rnd = Math.abs(r.nextInt()) % src.length;
			buf[i] = src[rnd];
		}
		return new String(buf);
	}
	
	//Create a random array of Strings:
	private static String[] randStrings(int length, int size) {
		String[] s = new String[size];
		for (int i = 0; i < size; i++) 
			s[i] = randStrings(length);
		return s;
	}
	
	public static void print(byte[] b) {
	    for(int i = 0; i < b.length; i++)
	      System.out.print(b[i] + " ");
	    System.out.println();
	 }
	
	public static void print(String[] s) {
	    for(int i = 0; i < s.length; i++)
	      System.out.print(s[i] + " ");
	    System.out.println();
	}
	  
	public static void main(String[] args) {
		
		byte[] b = new byte[15];
	    r.nextBytes(b); // Fill with random bytes
	    print(b);
	    Arrays.sort(b);
	    print(b);
	    int loc = Arrays.binarySearch(b, b[10]);
	    System.out.println("Location of " + b[10] +
	      " = " + loc);
	    
		String[] s = randStrings(2, 10);
		 print(s);
		Arrays.<String>sort(s);
		print(s);
		 loc = Arrays.binarySearch(s, s[2]);
		    System.out.println("Location of " + s[2] +
		      " = " + loc);
	}

	

	
}
