package com.daoImpl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.util.*;
import com.dao.*;
import com.model.Employee;
public class EmployeeDAOImpl implements EmployeeDAO{

	public void createEmployee(Employee employee){
		// TODO Auto-generated method stub
		String sqlQuery="Insert into employee(employeename,email,salary,doj,bonus) values(?,?,?,?,?)";
		try{
			Connection con=DBUtil.getConnection();
			PreparedStatement prt=con.prepareStatement(sqlQuery);
			prt.setString(1, employee.getEmployeename());
			prt.setString(2, employee.getEmail());
			prt.setDouble(3, employee.getSalary());
			prt.setDate(4, new Date(employee.getDoj().getTime()));
			prt.setDouble(5, employee.getBonus());
			
			int executeUpdate=prt.executeUpdate();
			if(executeUpdate==1) {
				System.out.println("Employee is created...");
			}
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public Employee getEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		Employee employee=null;
		String sqlqry="Select * from employee where id=?";
		try {
			Connection con=DBUtil.getConnection();
			PreparedStatement prt=con.prepareStatement(sqlqry);
			prt.setInt(1, employeeId);
			ResultSet rs=prt.executeQuery();
			if(rs.next()) {
				
				//check here for wrapper class declaration
				
				int empId=rs.getInt(1);
				String empName=rs.getString(2);
				String email=rs.getString(3);
				double sal=rs.getDouble(4);
				Date doj=rs.getDate(5);
				double bonus=rs.getDouble(6);
				employee=new Employee();
				employee.setId(empId);
				employee.setEmployeename(empName);
				employee.setEmail(email);
				employee.setSalary(sal);
				employee.setDoj(doj);
				employee.setBonus(bonus);
				
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return employee;
	}

	public void updateEmployeeEmailById(String newEmail,Integer employeeId) {
		// TODO Auto-generated method stub
		String sql="Update employee set email=? where id=?";
		try {
			
		}
		
		
	}

	public void deleteEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getAllEmployeesInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
