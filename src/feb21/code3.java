package feb21;

public class code3 {
	int eid;
	String name;
	int phone;
	String email;
	int salary;
	String project;
	code3(int eid, String name, int phone, String email){
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	code3(int eid, String name, int phone, String email,int salary, String project){
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.project = project;
	}
public static void main(String[] args) {
	code3 c = new code3(12,"Abhi",1234,"abc@gmail.com");
	code3 c1 = new code3(11,"om",123344,"om@gmail.com",1243,"dmavenpro");
	
	System.out.println(c.eid+","+c.name+","+c.phone+","+c.email);
	System.out.println(c1.eid+","+c1.name+","+c1.phone+","+c1.email+","+c1.salary+","+c1.project);
}
}
