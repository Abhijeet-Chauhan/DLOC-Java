import java.sql.*;
import java.util.Scanner;
public class jdbc7 {
public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_record";
		String username="root";
		String pswd = "0000";

		Connection con=DriverManager.getConnection(url,username,pswd);
		Statement stmt=con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is cutoff sal");
		int cutoff = sc.nextInt();
		
		String sql_query=String.format("delete from Employee3 where esal<%d",cutoff);
		int updateCount = stmt.executeUpdate(sql_query);
		
		System.out.println("no of rows "+updateCount);
		con.close();
	
}
}