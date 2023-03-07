package com.powermock.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.powermock.api.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/check")
	public String healthCheck(Integer id) {
		boolean check = employeeService.checkIt(id);
		if (check) {
			return "UP";
		} else {
			return "DOWN";
		}
	}

}
