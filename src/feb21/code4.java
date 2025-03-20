package feb21;

public class code4 {
	int eid;
	String name;
	int phone;
	String email;
	int salary;
	String project;
	code4(int eid, String name, int phone, String email){
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	code4(int eid, String name, int phone, String email,int salary, String project){
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.project = project;
	}
	public String toString() {
		return eid+" "+name;
	}
public static void main(String[] args) {
	code4 c = new code4(12,"Abhi",1234,"abc@gmail.com");
	code4 c1 = new code4(11,"om",123344,"om@gmail.com",1243,"dmavenpro");
	
	System.out.println(c);
	System.out.println(c1.eid+","+c1.name+","+c1.phone+","+c1.email+","+c1.salary+","+c1.project);
}
}
