import java.sql.*;
public class jdbc1 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_record";
		String username="root";
		String pswd = "0000";
		
		Connection con=DriverManager.getConnection(url,username,pswd);
		Statement stmt=con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from customer");
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		}
		else {
			System.out.println("Connecion established");
		}
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3)+".."+rs.getString(4));
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
