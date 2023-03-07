package com.powermock.api.service;

import com.powermock.api.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public UserService() {
	}

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public String getNameByUserId(Integer id) {
		String name = userDao.findNameById(id);
		// System.out.println("inside getNameByUserId service ...");
		return name;
	}

	public String getEmailByUserId(Integer id) {
		String email = userDao.findEmailById(id);
		return email;
	}

	public void doProcess() {
		System.out.println("doProcess() started...");
		pushMsgToKafkaTopic("msg");
		System.out.println("doProcess() ended...");
	}

	public void pushMsgToKafkaTopic(String string) {
		System.out.println("msg pushing to kafka...");
	}

	public String doWork(String msg) {
		String formmatedMsg = formatMsg(msg);
		return formmatedMsg;
	}

	private String formatMsg(String msg) {
		return msg.toUpperCase();
	}

}
