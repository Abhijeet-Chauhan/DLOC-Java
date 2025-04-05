
public class student {
int std_id;
String std_name;
static String batch_code="ANP-D0582";
public static void main(String[] args) {
	student s1=new student();
	s1.std_id=101;
	s1.std_name="Pooja";

	student s2=new student();
	s2.std_id=102;
	s2.std_name="Rahul";
	
	
	student s3=new student();
	s3.std_id=103;
	s3.std_name="Prithvi";
		
	System.out.println("----------Student Details----------");
	System.out.println(s1.std_id+" "+s1.std_name+" "+batch_code);
	System.out.println(s2.std_id+" "+s2.std_name+" "+batch_code);
	System.out.println(s3.std_id+" "+s3.std_name+" "+batch_code);
}
}












