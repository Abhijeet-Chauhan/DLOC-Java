import java.io.FileOutputStream;
import java.sql.*;

public class jdbc14 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/student_record";
        String username = "root";
        String pswd = "0000";

        Connection con = DriverManager.getConnection(url, username, pswd);
        Statement stmt = con.createStatement();

        String sql = "Select * from Employee3";
        ResultSet rs = stmt.executeQuery(sql);

        String data = "";
        data = data + "<html><body><center><table border='1' bgcolor='yellow'>";
        data = data + "<tr><th>Eno</th><th>Name</th><th>Esal</th><th>Eaddr</th></tr>"; // Close the header row

        while (rs.next()) {
            data = data + "<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getInt(3) + "</td><td>" + rs.getString(4) + "</td></tr>";
        }

        data = data + "</table></center></body></html>";

        FileOutputStream fos = new FileOutputStream("emp.html");
        byte[] b = data.getBytes();
        fos.write(b);  
        fos.flush();  
        fos.close(); 
        System.out.println("HTML file created: emp.html");

        con.close(); 
    }
}
