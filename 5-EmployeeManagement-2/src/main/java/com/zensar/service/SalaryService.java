package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zensar.model.Salary;
import com.zensar.repository.SalaryRepository;

@Service
public class SalaryService {
	@Autowired
	private SalaryRepository repository;
	
	
	public Salary saveSalary(Salary salary)
	{
		return repository.save(salary);
	}
	
	
	public List<Salary> getAllSalary(){
		return repository.findAll();
	}	

}
