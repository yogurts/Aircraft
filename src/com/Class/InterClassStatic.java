package com.Class;

import com.Class.C.D;

public class InterClassStatic {

	public static void main(String[] args) {
		C.D a_b = new C().new D();  //ok static 在new前面不需要用对象实例变量
		C a = new C();
		C.D ab = a.new D();
		
		Outer.Inner oi = new Outer.Inner();
	}
}

class C{
	private int x;
	void m(){
		new D();
	}

	static void sm(){
		//new D();  //error!!
	}
	
	class D{
		D(){x = 5;}
	}
}

class Outer{
	
	static class Inner{
		
	}
}
