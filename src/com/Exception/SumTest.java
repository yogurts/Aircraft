package com.Exception;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ita
 * 
 * 保证程序在修改后其结果仍然是正确的 测试驱动的开发过程 JUnit
 * @Test来标注测试函数
 * 在测试中常用的语句：
 * fail(信息);//表示程序出错
 * assertEqauls(参数1,参数2) //表示程序要保证两个参数要相等
 * assertNull(参数); //表示参数要为null
 * 
 */
public class SumTest {
	
	@Test
	public void testSum() {
		Sum s =  new Sum();
		assertEquals(s.sum(1,10), 11);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSum1() {
		Sum s =  new Sum();
		assertEquals(s.sum(1,10), s.sum(10,1));
		//fail("Not yet implemented");
	}

}
