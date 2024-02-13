package emp;

import java.util.*;


public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmployeeDao empDao=new EmployeeDao();
		System.out.println("Choose an option:");
		System.out.println("1.View employee\n2.Add employee\n3.Update Employee Detail\n4.delete Employee\n5.Fetch empolyee Detail\n6.Exit");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
			case 1:
				viewEmp(empDao,sc);
				break;
		}
		
//		Employee emp=new Employee("dRishi","cdse","devops","webops","25/02/2003","rishi@gmail","25/01/2003","b+","sekkadi","contact","avail");
//		empDao.addEmployee(emp);
		

	}
	static void viewEmp(IEmployeeDao empDao,Scanner sc) {
		System.out.println("How do you want to view:");
		System.out.println("1.By department\n 2.By role\n3.By Project\n4.By Status");
		int option=sc.nextInt();
		sc.nextLine();
		switch(option){
			case 1:
				System.out.println("Enter your department:");
				String dept=sc.nextLine();
				List<Employee> e1=empDao.getAllEmployeeByDepartment(dept);
				for(Employee e:e1) {
					System.out.println(e);
				}
				break;
		}
		
	}

}
