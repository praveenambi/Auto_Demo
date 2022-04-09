package com.constructors;

public class Construct1 {

	int b; 
	String name ;


	public Construct1() {

		System.out.println("default " );

	}


	public Construct1(int b, String name ) {



		this.b=b;
		this.name= name;

		System.out.println(b);
		System.out.println(name);


	}


	public void name() {

		System.out.println("name method ");

	}



	public static void main(String[] args) {


		Construct1 obj= new Construct1(6, "Tesco");
		obj.name();


	}



}
