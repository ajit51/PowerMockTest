package com.powermock.api.utility;

public class Library {

	@SuppressWarnings("unused")
	private int sumOfTwoNumbers(Integer a, Integer b) {
		return a + b;
	}

	public int sumOfNumbers(int a, int b) {
		return sumOfTwoNumbers(a, b);
	}

	public static String message(String msg) {
		return msg;
	}

}
