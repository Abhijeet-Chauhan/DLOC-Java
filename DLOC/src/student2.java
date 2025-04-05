
public class student2 {
	int std_id;
	String std_name;
	static String colname = "IIHT";
	student2(int roll, String name){
		this.std_id = roll;
		this.std_name = name;
	}
	public static void main(String[] args) {
		student2 s1 = new student2(101, "Abhi");
		System.out.println(s1.std_id+" "+s1.std_name);
		System.out.println(s1.colname);
	}
}
