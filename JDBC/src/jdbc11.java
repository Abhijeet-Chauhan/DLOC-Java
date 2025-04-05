import java.sql.*;
public class jdbc11 {
public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_record";
		String username="root";
		String pswd = "0000";

		Connection con=DriverManager.getConnection(url,username,pswd);
		Statement stmt=con.createStatement();
		
		String sql="select count(*) from employee3;";
		ResultSet rs=stmt.executeQuery(sql);
		
		if(rs.next()) {
			System.out.println(rs.getInt(1));
		}
		con.close();
}}
