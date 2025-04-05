import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
public class jdbc17 {
	public static void main(String[] args)  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/student_record";
	    String username = "root";
	    String pswd = "0000";

	    Connection con = DriverManager.getConnection(url, username, pswd);
	    
//	    CallableStatement cstmt = con.prepareCall("{call addtwonumberd(?,?,?)}");
//	    cstmt.setInt(1, 100);
//	    cstmt.setInt(2, 200);
//	    cstmt.registerOutParameter(3, Types.INTEGER);
//	    cstmt.execute();
//	    System.out.println("result......."+cstmt.getInt(3));
//	    con.close();
	    
	    
	    
	    CallableStatement cstmt = con.prepareCall("{call empsal(?,?)}");
	    cstmt.setInt(1, 2);
	    cstmt.registerOutParameter(2, Types.INTEGER);
	    cstmt.execute();
	    System.out.println("salary......."+cstmt.getInt(2));
	    con.close();
	}
}
