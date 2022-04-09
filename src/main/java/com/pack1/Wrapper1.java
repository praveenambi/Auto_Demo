package com.pack1;

import java.math.BigDecimal;

public class Wrapper1 {

	public static void main(String[] args) {

		//
		// Integer, Double, Short, Float , Byte, Long

		
		  String s = "20.45"; 
		//  short s2 = (short) -32777;
		  
		/*
		 * System.out.println("the double " + s+34);
		 * 
		 * int i1 = Integer.parseInt(s);
		 * 
		 * System.out.println(i1+20);
		 */
		  
		  double d = Double.parseDouble(s);
		  
		  double d2 = d+30.90;
		// int d3= BigDecimal.valueOf(d2).ROUND_DOWN;
		  System.out.println(d2);
		  
			/*
			 * short s3 = Short.parseShort(s);
			 * 
			 * System.out.println(s3);
			 * 
			 * long l = Long.parseLong(s); System.out.println(l);
			 */
		
		/*
		 * int a = 45; byte b= 67; short s1 = 87; long l = 56;
		 * 
		 * Integer i1 = new Integer(a); System.out.println(i1);
		 * 
		 * Byte b1 = new Byte(b); System.out.println(b1);
		 * 
		 * System.out.println(i1.intValue());
		 */
		
		

	}

}
