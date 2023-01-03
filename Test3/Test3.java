package com.newlecture.web;


public class Test3 {
	
	static int factorial(int num) {
		
		return num<=1 ? 1 : num*factorial(num-1);
	};

	public static void main(String[] args) {

		int result = factorial(4);
		System.out.println(result);

	}


}


