package com.powermock.api.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.powermock.api.utility.WelcomeUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest(WelcomeUtil.class)
public class EmployeeServiceTest {

	@Test
	public void shouldMockStaticMethodTest() {
		final String value = "Guten Tag John";

		PowerMockito.mockStatic(WelcomeUtil.class);

		PowerMockito.when(WelcomeUtil.generateWelcome("John")).thenReturn(value);

		assertEquals("Guten Tag John", WelcomeUtil.generateWelcome("John"));
	}

}
