package com.BaseClass;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ita
 * 
 * Set集
 * 两个重要的实现HashSet及TreeSet
 * 其中TreeSet的底层是用TreeMap来实现的
 * Set中对象不重复 即:
 * hashCode()不等
 * 如果hashCode()相等,再看equals或==是否为false
 *
 */
public class TestSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Brazil");
		set.add("China");
		set.add("Russia");
		set.add("India");
		set.add("China");
		set.add("South Africa");
		
		System.out.println(set.contains("China"));
		
		for (String obj : set) {
			System.out.println(obj);
		}
	}
}
