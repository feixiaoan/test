package classfile;
import java.sql.Connection;
import java.sql.DriverManager;
public class datebc {
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:mldn"; 
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection conn = DriverManager.getConnection(DBURL,USER,PASSWORD);
		System.out.println(conn);
		conn.close();
	
	}

}
