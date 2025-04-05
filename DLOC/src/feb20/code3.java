package feb20;
import java.util.Scanner;

public class code3 {
	public static void main(String[] args) {
		code3 c = new code3();
		c.enrollment("abc@gmail.com","5382684");
	}
public void enrollment(String email, String phone) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter email");
	email = sc.next();
	System.out.println("enter phone");
	phone = sc.next();
//	verification
//	if
	System.out.println("student with "+email+" and "+phone+" got registered");
}
}
