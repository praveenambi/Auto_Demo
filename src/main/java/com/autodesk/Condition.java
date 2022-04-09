package com.autodesk;

public class Condition {

	public static void main(String[] args) {
		int result = 0;
		int a=10;
		int b=9;
		char oparetor= '+';
		switch (oparetor) {
		case '-':
			result = a-b;
			break;
		case '+':
			result = a+b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		default:
			break;

		}

		System.out.println(result);
	}

}