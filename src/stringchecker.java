import java.util.Scanner;
public class stringchecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String username = sc.next();
	String pass = sc.next();
	
	if (username.equalsIgnoreCase(pass)){
		System.out.println("same");}
		else {
			System.out.println("not same");
		}
}
}
