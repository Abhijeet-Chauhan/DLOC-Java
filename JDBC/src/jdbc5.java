import java.sql.*;
import java.util.Scanner;
public class jdbc5 {
public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_record";
		String username="root";
		String pswd = "0000";

		Connection con=DriverManager.getConnection(url,username,pswd);
		Statement stmt=con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is bonus");
		int bonus = sc.nextInt();
		System.out.println("what is range of salary");
		int sal = sc.nextInt();
		
		String sql_query=String.format("update Employee3 set esal=esal+%d where esal<=%d",bonus,sal);
		int updateCount = stmt.executeUpdate(sql_query);
		
		System.out.println("no of rows"+updateCount);
		con.close();
	
}
}
