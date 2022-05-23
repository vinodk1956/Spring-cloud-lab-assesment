package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
