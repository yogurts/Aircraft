package com.BaseClass;

public class TestStringMethod {
	
	public static void main(String[] args) {
		
		String s = new String("Hello World");
		
		System.out.println(s.length());
		System.out.println(s.indexOf('o'));
		System.out.println(s.startsWith("He"));
		System.out.println(s.equals("Hello world"));
		System.out.println(s.equalsIgnoreCase("Hello world"));
		System.out.println(s.compareTo("Hello Java"));
		System.out.println(s.charAt(1));
		System.out.println(s.substring(0,2));
		
	}
	
}
