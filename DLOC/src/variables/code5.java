package variables;

public class code5 {
	int std_id;
	String std_name;
	static String colname = "IIHT";
	code5(int roll, String name){
		this.std_id = roll;
		this.std_name = name;
	}
	public static void main(String[] args) {
		code5 s1 = new code5(101, "Abhi");
		
		code5 s2 = new code5(102, "Abhgfdi");
		
		System.out.println(s1.std_id+" "+s1.std_name);
		System.out.println(s2.std_id+" "+s2.std_name);
		System.out.println(s1.colname);
	}
}
