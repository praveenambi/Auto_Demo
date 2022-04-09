package com.opConcepts;

public class Construct1 extends Construct2 {
	
	public  Construct1(int i ) {
		super(i);
		System.out.println("default Constructor1");
		System.out.println(super.u);
		
	}
	
	public void m1() {
		super.u=78;
		
	}

	public static void main(String[] args) {
		
		Construct1 obj = new Construct1(89);

	}

}
