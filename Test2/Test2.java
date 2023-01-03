package com.newlecture.web;

class Calculator {
	
	private int add;
	private int subtract;
	private int sum = 0;
	
	public Calculator add(int num) {
		
		sum += num;
		
		return this;
	}
	public Calculator subtract(int num) {
		sum -= num;
		
		return this;
	}
	
	int out() {
		
		return sum;
	}

}

public class Test2 {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

		int result = calculator.add(4).add(5).subtract(3).out();
		print(result);

	}
	
	public static void print(int num) {
		System.out.println(num);
	}
	


}


