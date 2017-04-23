import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC {
	public static void main(String[] args) {
		
		String sql = "select * from city";
		JdbcUtil jdbc = new JdbcUtil();
		ResultSet rs = jdbc.selectResult(sql);


		try {
			while(rs.next()){
				String name = rs.getString(1);
				System.out.println(name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
