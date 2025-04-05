import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
public class jdbc20 {
	public static void main(String[] args)  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/student_record";
	    String username = "root";
	    String pswd = "0000";

	    Connection con = DriverManager.getConnection(url, username, pswd);
	    
	    System.out.println("Before Update:");
		displayTimestamps(con, 1);

		String updateSQL = "UPDATE products SET price = ? WHERE id = ?";
		PreparedStatement updateStmt = con.prepareStatement(updateSQL);
		updateStmt.setDouble(1, 45678.34);
		updateStmt.setInt(2, 3);
		updateStmt.executeUpdate();
		updateStmt.close();

		System.out.println("After Update:");
		displayTimestamps(con, 1);

		con.close();
	}
	private static void displayTimestamps(Connection conn, int productId) throws Exception {
		String querySQL = "SELECT created_at, updated_at FROM products WHERE id = ?";
		PreparedStatement queryStmt = conn.prepareStatement(querySQL);
		queryStmt.setInt(1, productId);
		ResultSet rs = queryStmt.executeQuery();

		if (rs.next()) {
			System.out.println("Created At: " + rs.getTimestamp("created_at"));
			System.out.println("Updated At: " + rs.getTimestamp("updated_at"));
		}

		rs.close();
		
	}
}
