import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc15 {
public static void main(String[] args)  throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
     String url = "jdbc:mysql://localhost:3306/student_record";
     String username = "root";
     String pswd = "0000";

     Connection con = DriverManager.getConnection(url, username, pswd);
     Statement stmt = con.createStatement();
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter query");
     String sql=sc.nextLine();
     boolean b=stmt.execute(sql);
     
     if(b == true) {
			boolean flag = false;
			
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("Eno\tEname\tEsal\tEaddr");
			System.out.println("------------------------");
			while(rs.next()) {
				flag=true;
				System.out.println(rs.getInt(1)+"\t"
						+rs.getString(2) + 
						"\t" + rs.getDouble(3)+"\t"
						+rs.getString(4));
			}
			
			if(flag == false) {
				System.out.println("No Records Found.");
			}
		} else {//non select
			int rowCount = stmt.getUpdateCount();
    	 System.out.println("rows affected "+rowCount);
     }
     con.close();
}
}
