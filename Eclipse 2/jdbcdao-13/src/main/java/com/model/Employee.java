package com.model;
import java.util.*;

public class Employee {
	private int id;
	private String employeename,email;
	private double salary,bonus;
	private Date doj;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String toString() {
		return "Employee id="+ id+ "\nEmployee Name:"+employeename+"\nEmail:"+email+"\nSalary:"+salary+"\nDate of joined:"+doj+"\nBonus:"+bonus;
	}
}
