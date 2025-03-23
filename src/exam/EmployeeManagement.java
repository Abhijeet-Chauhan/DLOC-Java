package exam;

public class EmployeeManagement {
	//declaring variables
	private int eid;
	String ename;
	private float salary;
	String department;
	private String project;
	static String company="ABC";
	private int UAN;
	String doj;
	String EmployementType;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getUAN() {
		return UAN;
	}
	public void setUAN(int uAN) {
		UAN = uAN;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmployementType() {
		return EmployementType;
	}
	public void setEmployementType(String employementType) {
		EmployementType = employementType;
	}
	
	
	//overriding toString
	@Override
	public String toString() {
		return "EmployeeManagement [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department="
				+ department + ", project=" + project + ", company=" + company + ", UAN=" + UAN + ", doj=" + doj
				+ ", EmployementType=" + EmployementType + "]";
	}
	
	//custom constructor
	public EmployeeManagement(int eid, String ename, float salary, String department, String project,
			int UAN, String doj, String EmployementType) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
		this.project = project;
		this.UAN = UAN;
		this.doj = doj;
		this.EmployementType = EmployementType;
	}
	
	public static void main(String[] args) {
		        // Creating objects
		        EmployeeManagement e1 = new EmployeeManagement(12, "Abhijeet", 600000, "Datascience", "Project X", 12, "12th-March-2025", "Full-time");
		        EmployeeManagement e2 = new EmployeeManagement(13, "Om", 550000, "Software Development", "Project A", 13, "15th-March-2025", "Full-time");
		        EmployeeManagement e3 = new EmployeeManagement(14, "Karan", 500000, "Data Engineering", "Project B", 14, "20th-March-2025", "Full-time");
		        EmployeeManagement e4 = new EmployeeManagement(15, "Abhishekh", 650000, "AI/ML", "Project C", 15, "25th-March-2025", "Full-time");
		        EmployeeManagement e5 = new EmployeeManagement(16, "Giridhar", 700000, "Cloud Computing", "Project D", 16, "30th-March-2025", "Full-time");
		        EmployeeManagement e6 = new EmployeeManagement(17, "Somnath", 750000, "DevOps", "Project E", 17, "5th-April-2025", "Full-time");

		        // printing employees
		        System.out.println(e1);
		        System.out.println(e2);
		        System.out.println(e3);
		        System.out.println(e4);
		        System.out.println(e5);
		        System.out.println(e6);
	}
}
