package com.arrays;

import java.text.StringCharacterIterator;

public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t ="78";
		double d = 90.89;
		int e = Integer.parseInt(t);
		
		byte b = Byte.parseByte(t);
		System.out.println(b);
		short s = Short.parseShort(t);
		System.out.println(s);
		String str = String.valueOf('c');
		System.out.println(str);;
		
		Byte bt = new Byte(b);
		
		System.out.println(bt);
		
		byte  b1 = bt.byteValue();
		
		System.out.println(b1);
	}

}
