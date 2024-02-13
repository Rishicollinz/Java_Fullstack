package byname;

public class Employee {
	private int empId;
	private String empName,empEmail;
	Pancard pancard1;
	Pancard pancard2;
	
	public Pancard getPancard2() {
		return pancard2;
	}
	public void setPancard2(Pancard pancard2) {
		this.pancard2 = pancard2;
	}
	public Pancard getPancard1() {
		return pancard1;
	}
	public void setPancard1(Pancard pancard1) {
		this.pancard1 = pancard1;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	

}
