package emp;

import java.util.List;

import emp.Employee;

public interface IEmployeeDao {
	void addEmployee(Employee employee);
	List<Employee> getAllEmployeeByDepartment(String department);
}
