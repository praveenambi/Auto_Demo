package com.leetcode;

import com.arrays.Arrays;

public class MedianOfArrays {
	
	static int[] a = {2,9,4};
	static int[] b = {5,6,7};

	public static void main(String[] args) {
		
		
		int alnght = a.length;
		int blenght = b.length;
		
		int clnght  = alnght+blenght;
		
		int[] c = new int[clnght];
		
		
		System.arraycopy(a, 0, c, 0,alnght );
		System.arraycopy(b, 0, c, alnght, blenght);
		
		System.out.println(java.util.Arrays.toString(c));
		
		java.util.Arrays.sort(c);
		System.out.println(java.util.Arrays.toString(c));
		

	}

}
