import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {

	private static String url = "jdbc:mysql://localhost:3306/city";
	private static String username = "root";
	private static String password = "986182669";
	private static String driverName = "com.mysql.jdbc.Driver";
	private	static Connection con = null;
	private PreparedStatement pstmt;
	private ResultSet result = null;
	
		static{
			try {
				Class.forName(driverName);
				con = DriverManager.getConnection(url, username, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	public ResultSet selectResult(String sql){
		try {
			pstmt = con.prepareStatement(sql);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	public int toDelete(String sql){
		PreparedStatement pstmt;
		int result1 = 0;
		try {
			pstmt = con.prepareStatement(sql);
			result1 = pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result1;
		
		
	}
}













