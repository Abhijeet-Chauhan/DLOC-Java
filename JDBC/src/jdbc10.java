import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class jdbc10 {
public static void main(String[] args)throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_record";
		String username="root";
		String pswd = "0000";
		
		Connection con=DriverManager.getConnection(url,username,pswd);
		Statement stmt=con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is lower limit");
		int lower = sc.nextInt();
		System.out.println("what is upper limit");
		int upper = sc.nextInt();
		
		String sql_query=String.format("select * from Employee3 where esal between %d and %d",lower,upper);
		boolean flag=false;
		ResultSet rs = stmt.executeQuery(sql_query);
		
		System.out.println("Eno\tEname\tEsal\tEadd");
		while(rs.next()) {
			flag=true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));		
}
		if(flag==false) {
			System.out.println("no record found");
		}
		con.close();
}}
