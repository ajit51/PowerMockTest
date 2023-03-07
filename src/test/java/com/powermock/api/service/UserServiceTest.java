package com.powermock.api.service;

import static org.mockito.ArgumentMatchers.anyString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import com.powermock.api.dao.UserDao;
import com.powermock.api.dao.UserDaoImpl;

public class UserServiceTest {

	@Test
	public void testGetNameByUserId() {
		UserDao mockDao = PowerMockito.mock(UserDao.class);
		PowerMockito.when(mockDao.findNameById(101)).thenReturn("Nick");

		UserService service = new UserService(mockDao);
		String name = service.getNameByUserId(101);
		Assertions.assertEquals("Nick", name);
	}

	@Test
	public void testGetEmailByUserId() {
		UserDaoImpl mockDao = PowerMockito.mock(UserDaoImpl.class);
		PowerMockito.when(mockDao.findEmailById(101)).thenReturn("john@gmail.com");

		UserService service = new UserService(mockDao);
		String email = service.getEmailByUserId(101);
		Assertions.assertEquals("john@gmail.com", email);
	}

	/*
	 * @Test public void testDoProcess() { UserService mockService =
	 * PowerMockito.mock(UserService.class); try {
	 * PowerMockito.doNothing().when(mockService, "pushMsgToKafkaTopic",
	 * anyString()); mockService.doProcess(); }catch (Exception e) {
	 * e.printStackTrace(); } }
	 */

	/*
	 * @Test public void testDoWorkWithPrivateMethodMock() throws Exception {
	 * UserService service = new UserService(); UserService spy =
	 * PowerMockito.spy(service); PowerMockito.doReturn("Test Msg").when(spy,
	 * "formatMsg", "test msg"); String formmatedMsg = service.doWork("test msg");
	 * Assertions.assertEquals("Test Msg", formmatedMsg); }
	 */

}
