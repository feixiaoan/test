import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class dbc2 {
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:mldn";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	public static void main(String[] args)throws Exception {
		//第一步：加载数据库驱动程序，此时不需要实例化，因为会由容器自己负责管理
		Class.forName(DBDRIVER);
		//第二步：连接数据库
		Connection conn = DriverManager.getConnection(DBURL,USER,PASSWORD);
		//第三步：进行数据库的数据操作
		Statement stmt = conn.createStatement();
		//编写SQL的过程中，语句太长增加换行，记住在前面加上空格
		
		 //数据插入
		String sql = " INSERT INTO member(mid,name,birthday,age,note) VALUES " 
			+ " (myseq.nextval,'张三',TO_DATE('1998-10-10','yyy-mm-dd'),17,'是个人') ";
		/**/
		/*
		//更新数据
		String sql = " UPDATE member SET name='李四',birthday=SYSDATE,age=30 WHERE mid IN(2,5,7,9) ";
		
		
		//删除数据
		String sql = " DELETE FROM member WHERE mid IN(9,5,7) ";
		*/
		int len = stmt.executeUpdate(sql); //执行SQL返回更新的数据行
		System.out.println("影响的数据行：" + len);
		//第四步：关闭数据库
		stmt.close();
		conn.close();

	}
}
 