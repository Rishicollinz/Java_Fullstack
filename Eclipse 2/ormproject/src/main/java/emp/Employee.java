package emp;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid")
	int empId;
	
	@Column(name="name")
	String name;
	
	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Column(name="department")
	String department;
	
	@Column(name="role")
	String role;
	
	@Column(name="project")
	String project;
	
	@Column(name="doj")
	String doj;
	
	@Column(name="email")
	String email;
	
	@Column(name="dob")
	String dob;
	
	@Column(name="bloodgroup")
	String bloodgroup;
	
	@Column(name="address")
	String address;
	
	@Column(name="contact")
	String contact;
	
	@Column(name="status")
	String status;
	
	public Employee() {
		
	}
	
	public Employee(String name,String department,String role,String project,String doj,String email,String dob,String bloodgroup,String address,String contact,String status ) {
		this.name=name;
		this.department=department;
		this.role=role;
		this.project=project;
		this.doj=doj;
		this.email=email;
		this.dob=dob;
		this.bloodgroup=bloodgroup;
		this.address=address;
		this.contact=contact;
		this.status=status;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return "Employee Name:"+name+"\nEmployee Role"+role;
	}
	
	
	

}
