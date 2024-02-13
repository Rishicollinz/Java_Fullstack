package autowire;

public class Employee {
	private int empId;
	String empName,empEmail;
	Pancard pancard;
	public Employee(int empId, String empName, String empEmail, Pancard pancard) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.pancard = pancard;
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
	public Pancard getPancard() {
		return pancard;
	}
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
}
