package com.powermock.api.utility;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

	@Test
	public void testSumOfNumbers() {
		Library library = new Library();
		int sumOfNumbers = library.sumOfNumbers(10, 30);
		Assertions.assertEquals(40, sumOfNumbers);
	}

	@Test
	public void testSumOfTwoNumbers() throws Exception {
		Method method = Library.class.getDeclaredMethod("sumOfTwoNumbers", Integer.class, Integer.class);
		method.setAccessible(true);
		Library library = new Library();
		int sum = (int) method.invoke(library, 20, 30);
		Assertions.assertEquals(50, sum);
	}
	
	@Test
	public void testMessage() {
		
	}

}
