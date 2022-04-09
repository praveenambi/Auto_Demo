package com.autodesk;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//String name =  "veerabhadrappa";
	
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please enter the name ");
		String name = scan.next();
		
		for (int i = name.length()-1; i >= 0; i--) {
			
			System.out.print(name.charAt(i) + "");
			
		}
		
	}

}
