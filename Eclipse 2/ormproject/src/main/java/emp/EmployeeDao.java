package emp;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;





public class EmployeeDao implements IEmployeeDao{

	public void addEmployee(Employee employee) {
		Transaction trans=null;
		Session session=HibernateUtil.getSessionfactory().openSession();
		trans=session.beginTransaction();
		session.save(employee);
		trans.commit();
	}
	

@SuppressWarnings({ "unchecked", "null" })
	public List<Employee> getAllEmployeeByDepartment(String dept) {
		Transaction trans=null;
		List<Employee> employee=null;
		Employee emp=null;
		Session session=HibernateUtil.getSessionfactory().openSession();
		trans=session.beginTransaction();
		do {
		emp=(Employee) session.get(Employee.class,dept);
		employee.add(emp);
		}while(emp!=null);
		return employee;
	}

}