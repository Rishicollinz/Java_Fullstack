package com.dao;
import com.model.Employee;
import java.util.*;
public interface EmployeeDAO {
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(Integer employeeId);
	public abstract void updateEmployeeEmailById(String newEmail,Integer employeeId);
	public abstract void deleteEmployeeById(Integer employeeId);
	public abstract List<Employee> getAllEmployeesInfo();
}
