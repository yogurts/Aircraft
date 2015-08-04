package com.BaseClass;

import java.util.ArrayList;


/**
 * @author Ita
 *
 * List接口:线性表(linear list)
 * 主要的实现类 ArrayList.Linkedlist,以及早期的Vector
 * 迭代器 Iterator (所有的Collection都能产生)
 */
public class TestArrayList {
	
	public static void main(String[] args) {
		ArrayList h = new ArrayList();
		h.add("1st");
		h.add("2nd");
		h.add(new Integer(3));
		h.add(new Double(4.0));
		h.add("2nd");  //重复元素加入
		h.add(new Integer(3));  //重复元素，加入
		m1(h);
	}

	public static void m1(ArrayList s) {
		System.out.println(s);
	}

}
