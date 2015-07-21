package com.Polymorphism;

/**
 * @author Ita
 * 
 * 构造方法执行过程步骤：先父类构造--再本类成员赋值--最后执行构造方法中的语句
 *
 */
public class PConstructor {
	
	int a = 2000;
	PConstructor(){
		this.a = 3000;
	}

}
