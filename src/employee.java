
public class employee {
	int emp_id;
	String emp_name;
	int salary;
	String dept;
	static String comp = "ANUDIP";
public static void main(String[] args) {
	employee e1 = new employee();
	employee e2 = new employee();
	
	e1.emp_id = 101;
	e1.emp_name = "Subhash";
	e1.salary = 10000;
	e1.dept = "IT";
	
	e2.emp_id = 102;
	e2.emp_name = "Sudhanshu";
	e2.salary = 20000;
	e2.dept = "FIN";
	
	System.out.println(e1.emp_id + " " + e1.emp_name + " " + e1.salary + " " + e1.dept + " " + comp);
	System.out.println(e2.emp_id + " " + e2.emp_name + " " + e2.salary + " " + e2.dept + " " + comp);
}
}
