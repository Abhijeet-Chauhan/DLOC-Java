import java.sql.*;
public class jdbc3 {
	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_record";
		String username="root";
		String pswd = "0000";
		
		
		String sql_query = "insert into Employee3 values (100, 'aaa',34000,'mumbai');";

		Connection con=DriverManager.getConnection(url,username,pswd);
		Statement stmt=con.createStatement();
		int updateCount = stmt.executeUpdate(sql_query);
		System.out.println("No. of rows inserted: "+updateCount);
		
		con.close();
		
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		} else {
			System.out.println("Connnection Established");
		}
		
}
}

