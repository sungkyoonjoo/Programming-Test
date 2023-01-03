package com.newlecture.web;


public class Test4 {
	
	static int factorialTail(int num, int acc) {
		if(num <= 1)
			return acc;
		
		return factorialTail(num-1, acc*num);
	};

	
	static int factorial(int num) {
		return factorialTail(num, 1);
	};

	public static void main(String[] args) {

		int result = factorial(4);
		System.out.println(result);

	}


}


