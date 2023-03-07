package com.powermock.api.dao;

public class UserDaoImpl implements UserDao {

	@Override
	public String findNameById(Integer id) {
		System.out.println("findNameById() called ...");
		return "John";
	}

	@Override
	public String findEmailById(Integer id) {
		System.out.println("findEmailById() called ...");
		return "john.k@gmail.com";
	}

}
