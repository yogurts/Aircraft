package com.BaseClass;

import java.util.PrimitiveIterator.OfDouble;

public class Recursive {

	public static void main(String[] args) {
		System.out.println("fac of 5 is " + fac(5));
	}
	
	static long fac(int n){
		if (n==0) return 1;
		else return fac(n-1) * n;
	}
}
