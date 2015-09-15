import java.sql.*;

public class TestJDBC {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost/test";
		String query = "SELECT Title, Author FROM Catalog";
		Class.forName("org.sqlite.JDBC");
		
		Connection conn = DriverManager.getConnection(url, "root", "111111");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
			System.out.print(rs.getString("Title") + " by " + rs.getString("Author"));
		rs.close();
		stmt.close();
		conn.close();
	}
}
