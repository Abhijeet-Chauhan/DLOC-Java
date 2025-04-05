import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc16 {
public static void main(String[] args)  throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/student_record";
    String username = "root";
    String pswd = "0000";

    Connection con = DriverManager.getConnection(url, username, pswd);
    //Statement stmt = con.createStatement();
    String sql = "insert into employee3 values(?,?,?,?)";
    PreparedStatement pstmt = con.prepareStatement(sql);
    Scanner sc = new Scanner(System.in);
    while(true) {
    	System.out.println("eid: ");
    	int eid=sc.nextInt();
    	System.out.println("name: ");
    	String ename=sc.next();
    	System.out.println("salary: ");
    	float esal=sc.nextFloat();
    	System.out.println("addr: ");
    	String eaddr =sc.next();
    	
    	pstmt.setInt(1, eid);
    	pstmt.setString(2,ename);
    	pstmt.setDouble(3, esal);
    	pstmt.setString(4,eaddr);
    	
    	pstmt.executeUpdate();
    	System.out.println("insereted successfully");
    	System.out.println("wanna continue?");
    	String choice = sc.next();
    	if(choice.equalsIgnoreCase("no")) {
    		
    		break;
    	}
    }
    con.close();
}
}
