package com.autodesk;

public class Loops {

	public static void main(String[] args) {


		// 1. while loop

		int a= 5;

		while (a<10) {

			System.out.println(a);

			a++;

		}

		System.out.println("********************************");

		// 2. do while loop

		do {

			System.out.println(a);

			a++;

		} while (a<10);

		System.out.println("********************************");

		// 3. for loops 

		for (int i = 0; i <10 ; i++) {

			System.out.println(i);

		}
		System.out.println("********************************");


		// 4. for each 
		int[] arr = {3,5,7,8,9};

		for (int a2 : arr) {
			
			System.out.println(a2);

		}
		
		System.out.println("********************************");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}

	}

}
