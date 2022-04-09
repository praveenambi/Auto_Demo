package com.opConcepts;

public class MethodOverLoad {


   // name should main , string[] args , public , static in nature , void 
	public static void main(String[] args) {

		MethodOverLoad obj = new MethodOverLoad();
		obj.add(8,9);
		//main("Praveen");
		

	}

	public  static void main(String str) {

		System.out.println(str);

	}

	public  static void main(String str, double d) {

		System.out.println(str + d);

	}




	public void add() { //  add with zero paratmetrs

		System.out.println("Add with zero params");
	}


	public  void add(int a) { //  add with onw int  paratmetrs

		System.out.println("Add with one params" + a);
	}

	/*
	 * public void add(String q) {
	 * 
	 * 
	 * 
	 * }
	 */

	public void add(int a, int b) { //  add with two int  paratmetrs


		int c = a+b;
		System.out.println("Add with two params" + c);
	}



}
