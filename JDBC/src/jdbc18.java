import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
public class jdbc18 {
	public static void main(String[] args)  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/student_record";
	    String username = "root";
	    String pswd = "0000";

	    Connection con = DriverManager.getConnection(url, username, pswd);
	    
	    CallableStatement cstmt = con.prepareCall("{?=call avg_numbers(?,?)}");
	    cstmt.setInt(2, 100);
	    cstmt.setInt(3, 200);
	    cstmt.registerOutParameter(1, Types.INTEGER);
	    
	    cstmt.execute();
	    System.out.println("result......."+cstmt.getInt(1));
	    con.close();
	}
}
