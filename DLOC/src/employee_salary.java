import java.util.Scanner;
public class employee_salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="";
		int eid;
		int salary=0;
		int total_salary=0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter name of employee "+i+":");
			name=sc.next();
			System.out.println("Employee name: "+name);
			
			System.out.println("Enter id of employee "+i+":");
			eid=sc.nextInt();
			System.out.println("Employee id: "+eid);
			
			System.out.println("Enter salary of employee "+i+":");
			salary=sc.nextInt();
			System.out.println("Employee salary: "+salary);
			
			total_salary = total_salary + salary;
		}
		System.out.println("toal_salary: "+total_salary);
	
	}
}


