import java.sql.*;
public class jdbc2 {
	public static void main(String[] args)throws Exception {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student_record";
			String username="root";
			String pswd = "0000";
			
			
			String sql_query = "create table Employee3(eid int, ename varchar(10),esal int,"
					+ "eaddr varchar(20));";
			Connection con=DriverManager.getConnection(url,username,pswd);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql_query);
			System.out.println("Table created");
			con.close();
			
		
}}
