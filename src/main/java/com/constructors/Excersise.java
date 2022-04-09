package com.constructors;

public class Excersise {
	
	
	public static long kiloconvert(long kilometer) {
		long meter= (kilometer/2);

		System.out.println(meter);
		if (meter>1)
		{
		return 1;
		}

		else if(meter<=1)
		{
		return 0;
		}
		else if (meter<1)
		{
		return 0;
		
		}
		
	
		return meter;
		
		
		}
	

	public static void main(String[] args) {
		
		kiloconvert(8);

	}

}
