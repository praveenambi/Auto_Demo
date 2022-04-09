package com.autodesk;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u =16;
		byte d = 125;  // value ranges from -128 to 127  is an 8 bit two component integer 
		short y = -32766;  // value ranges from -32,768  to 32,767   its an 16 bit integer type 		
		
		System.out.println(d);
		System.out.println(y);
		System.out.println(u);
		
		
		
	 while (u < 20) {
		 
		 System.out.println("u is greater than 20 from while loop " + u );
		 
		 u++;
		
	}
	 
	 do {
		 
		 System.out.println("u is greater than 20" + u );
		 u++;
			
		
	} while (u < 20);
	 
	 int[] arr  = {3,8,9,0};
	 
	 for (int s : arr) {
		 
		 System.out.println(s);
		
	}
		
		
		
	}

}
