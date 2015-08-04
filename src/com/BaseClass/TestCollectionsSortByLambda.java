package com.BaseClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ita
 * 
 * Collections类 完全由在collection上进行操作静态方法组成
 * 如sort,binarySearch,reverse等
 *
 */
public class TestCollectionsSortByLambda {
	
	public static void main(String[] args) {
		List<Person2> school = new ArrayList<Person2>();
		school.add(new Person2("Li",23));
		school.add(new Person2("Wang",28));
		school.add(new Person2("Zhang",21));
		school.add(new Person2("Tang",19));
		school.add(new Person2("Chen",22));
		school.add(new Person2("Sun",23));
		System.out.println(school);
		
		Collections.sort(school, (p1,p2)->p1.age-p2.age);
		System.out.println(school);
		
		int index = Collections.binarySearch(
				school, new Person2("Li", 23), (p1,p2)->p1.age-p2.age);
		if (index >= 0) 
			System.out.println("Found:" + school.get(index));
		else
			System.out.println("Not Found!");
	}
	
}

class Person2{
	String name;
	int age;
	public Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name + ":" + age;
	}
	
}


class PersonComparator2 implements Comparator{
	public int compare(Object obj1, Object obj2){
		Person p1 = (Person) obj1;
		Person p2 = (Person) obj2;
		if (p1.age > p2.age) return 1;
		else if (p1.age < p2.age) return -1;
		return p1.name.compareTo(p2.name);
	}
	
}