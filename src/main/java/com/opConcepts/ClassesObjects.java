package com.opConcepts;

public class ClassesObjects {
	
	int age=40;
	int sal=30;
	
	
	public void m1() {
		
		System.out.println("menthod m1");
		
	}
	
	public static void main(String[] args) {
		
		ClassesObjects obj = new ClassesObjects();
		ClassesObjects obj1 = new ClassesObjects();
		ClassesObjects obj2 = new ClassesObjects();
		ClassesObjects obj3 = new ClassesObjects();
		
		
		obj.age=30;
		obj.sal=10000;
		obj.m1();
		System.out.println(obj.age);
		System.out.println(obj.sal);
		obj1.m1();
		obj2.m1();
	}

}
