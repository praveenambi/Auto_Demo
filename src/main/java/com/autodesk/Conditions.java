package com.autodesk;

public class Conditions {

	public static void main(String[] args) {

		// <, > , <= , >= , ==, !=, =

		int r = 90;
		int n = 9;

		// a==n
		int a = 100;
		int b = 200;
		int c = 300;

		if (r < n) {

			System.out.println("r is geater than n ");

		} else {

			System.out.println("r is lesser  than n ");
		}

		
		  if (a>b & a>c ) {
		  
		  System.out.println("a is highest value");
		  
		  }else if (b>c) {
		  
		  System.out.println("b is highest value");
		  
		  }else {
		  
		  System.out.println("C is highest value"); }
		  
		 
	}

}
