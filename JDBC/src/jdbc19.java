import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
public class jdbc19 {
	public static void main(String[] args)  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/student_record";
	    String username = "root";
	    String pswd = "0000";

	    Connection con = DriverManager.getConnection(url, username, pswd);
	    Statement stmt=con.createStatement();
	    stmt.addBatch("insert into employee3 values(123,'zz',7890,'sdsd')");
	    stmt.addBatch("update employee3 set esal=esal+1000 where esal<20000");
	    stmt.addBatch("delete from employee3 where esal<20000");
	    
	    int[] count=stmt.executeBatch();
	    int updateCount=0;
	    for(int x:count) {
	    	updateCount=updateCount+x;
	    }
	    System.out.println("no of rows affected "+updateCount);
	    con.close();
	}
}