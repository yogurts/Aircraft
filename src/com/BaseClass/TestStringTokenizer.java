package com.BaseClass;

import java.util.StringTokenizer;


/**
 * @author Ita
 * 
 * 提供对字符串进行分割的功能
 * 
 * public int countTokens(); //分割串的个数
 * public boolean hasMoreTokens(); //是否还有分割串
 * public String nextToken(); //得到下一分割串
 *
 */
public class TestStringTokenizer {
	

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("this is a test"," ");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		st = new StringTokenizer("253,197,546",",");

		System.out.println(st.countTokens());
		double sum = 0;
		while (st.hasMoreTokens()) {
			sum += Double.parseDouble(st.nextToken());
		}
		System.out.println(sum);
	}

}
