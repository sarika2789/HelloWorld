package com.example.Student;

public class OverloadingCalculator3 {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, long b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		OverloadingCalculator3 obj = new OverloadingCalculator3();
		obj.sum(20, 20);// now ambiguity
	}
}
