package com.powermock.api.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public static boolean checkIt(Integer id) {
		if (id == 1) {
			return true;
		} else {
			return false;
		}
	}

}
