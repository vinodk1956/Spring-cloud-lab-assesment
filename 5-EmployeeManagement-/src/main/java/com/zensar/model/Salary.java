package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeSalary")
public class Salary {
	
	@Id
	@GeneratedValue
	private int id;
	private double basicSalary;
	private double bonus;
	
	
	public Salary(int id, double basicSalary, double bonus) {
		super();
		this.id = id;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	}
	
	
	public Salary() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Salary [id=" + id + ", basicSalary=" + basicSalary + ", bonus=" + bonus + "]";
	}
	
	

}
