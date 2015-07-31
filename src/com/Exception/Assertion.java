package com.Exception;

/**
 * @author Ita
 * 
 * 运行时要使assert起作用，则在运行时，使用选项(-ea,即-enableassertions)
 * 如： java -ea -classpath . Assertion
 */
public class Assertion {
	
	public static void main(String[] args) {
		assert hypotenuse(3,4)== 5: "算法不正确";
	}
	
	static double hypotenuse(double x,double y){
		return Math.sqrt(x*x + y*y);
	}

}
