package com.BaseClass;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;


/**
 * @author Ita
 * 
 * Map是键-值对的集合
 * 其中可以去到entrySet()、ketSet()、values()
 * Map.Entry是一个嵌套接口
 * Map类的重要实现
 * HashMap类
 * TreeMap类:用红黑树的算法
 *
 */
public class TestMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<String, String>();
		map.put("b", "Brazil");
		map.put("r", "Russia");
		map.put("i", "India");
		map.put("c", "China");
		map.put("k", "South Africa");
		map.put("r", "Russia");
		
		System.out.println(map.get("c"));
		
		System.out.println("通过Map.keySet遍历key和value：");
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("通过Map.values()遍历所有的value，但不能遍历key");  
		for (String value : map.values()) {
			System.out.println(value);
		}
		
		
		System.out.println("通过Map.entrySet遍历key和value");  //推荐，尤其是容量大时
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");  
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>)it.next();
			 System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());  
			
		}
	}
}
