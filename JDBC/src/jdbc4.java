import java.sql.*;
import java.util.Scanner;
public class jdbc4 {
public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_record";
		String username="root";
		String pswd = "0000";

		Connection con=DriverManager.getConnection(url,username,pswd);
		Statement stmt=con.createStatement();
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Eid");
			int eno=sc.nextInt();
			System.out.println("Ename");
			String ename=sc.next();
			System.out.println("Esal");
			double esal=sc.nextDouble();
			System.out.println("Add");
			String eaddr=sc.next();
			
			String sql_query = String.format("insert into Employee3 values (%d, '%s',%f,'%s')",eno,ename,esal,eaddr);
			stmt.executeUpdate(sql_query);
			
			System.out.println("inserted successfully");
			System.out.println("want to continue");
			String option = sc.next();
			
			if(option.equalsIgnoreCase("No")) {
				break;
			}
		}
		con.close();
	
}
}
