package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.exception.ResourceNotFoundException;
import com.zensar.model.Employee;
import com.zensar.repository.EmployeeRepository;
import com.zensar.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}		
	
	// create employee rest api
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// get employee by id rest api
	@Override
	public Employee getEmployeeById(Long id) throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return employee;
	}
	
	// update employee rest api
	@Override
	public Employee updateEmployeeByIdWithNewEmployee( Long id,  Employee employeeDetails) throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		
		Employee updatedEmployee = employeeRepository.save(employee);
		return updatedEmployee;
	}
	
	// delete employee rest api
	@Override
	public boolean deleteEmployee( Long id) throws ResourceNotFoundException{
		boolean isDeleted= true;
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employeeRepository.delete(employee);
		if(employee==null) {
			isDeleted=false;
		}
		
		return isDeleted;
	}
}