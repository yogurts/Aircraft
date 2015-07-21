package com.Polymorphism;

public class ConstructSequence {
	
	public static void main(String[] args) {
		PersonA p = new StudentA("bb", 0, null);
	}
}

class PersonA{
	String name = "未命名";  //step 2
	int age = -1;
	PersonA(String name, int age){
		super();  //step 1
		//step 3
		System.out.println("开始构造PersonA(),此时this.name="+this.name);
		this.name = name;
		this.age = age;
		System.out.println("PersonA()构造完成,此时this.name="+this.name);
	}
}

class StudentA extends PersonA{
	String school = "未定学校";  //step 2
	StudentA(String name, int age, String school){
		super(name, age);  //step 1
		//step 3
		System.out.println("开始构造StudentA(),此时this.name="+this.name);
		System.out.println("开始构造StudentA(),此时this.school="+this.school);
		this.school = school;
		System.out.println("StudentA()构造完成,此时this.school="+this.school);
	}
}


