package com.opConcepts;

public class Static_NonStatic {
	
	static int a = 90;
	 String name = "Tesco";
	
	
	static {
		
		System.out.println("The static block is invoked ");
		System.out.println(a);
		
		m2();
	}
	
		
		  public static void main(String[] args) {
		  
		  Static_NonStatic obj = new Static_NonStatic(); obj.m1();
		  
		  m2(); Static_NonStatic.m2();
		  
		  System.out.println(a); System.out.println(obj.name);
		  
		  obj.m2();
		  
		  //System.out.println(name);
		  
		  }
		 
	
	
	public void m1() {
		
		System.out.println(name);
		
		System.out.println("menthod m1");
		
		System.out.println(a);
		
	}
	
	public static void m2() {
		
		System.out.println("menthod m2");
		
	}

}
