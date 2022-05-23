package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Salary;
import com.zensar.service.SalaryService;
import java.util.*;


@RestController
@RequestMapping("/api/v1")
public class SalaryController {
	@Autowired
	private SalaryService service;
	
	
	@PostMapping("/salary")
	public Salary salaryService(@RequestBody Salary salary)
	{
		return service.saveSalary(salary);
	}
	@GetMapping("/salary")
	public List<Salary> getAllSalary(){
		return service.getAllSalary();
	}

}
