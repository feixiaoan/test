import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class dbc2 {
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:mldn";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	public static void main(String[] args)throws Exception {
		//��һ�����������ݿ��������򣬴�ʱ����Ҫʵ��������Ϊ���������Լ��������
		Class.forName(DBDRIVER);
		//�ڶ������������ݿ�
		Connection conn = DriverManager.getConnection(DBURL,USER,PASSWORD);
		//���������������ݿ�����ݲ���
		Statement stmt = conn.createStatement();
		//��дSQL�Ĺ����У����̫�����ӻ��У���ס��ǰ����Ͽո�
		
		 //���ݲ���
		String sql = " INSERT INTO member(mid,name,birthday,age,note) VALUES " 
			+ " (myseq.nextval,'����',TO_DATE('1998-10-10','yyy-mm-dd'),17,'�Ǹ���') ";
		/**/
		/*
		//��������
		String sql = " UPDATE member SET name='����',birthday=SYSDATE,age=30 WHERE mid IN(2,5,7,9) ";
		
		
		//ɾ������
		String sql = " DELETE FROM member WHERE mid IN(9,5,7) ";
		*/
		int len = stmt.executeUpdate(sql); //ִ��SQL���ظ��µ�������
		System.out.println("Ӱ��������У�" + len);
		//���Ĳ����ر����ݿ�
		stmt.close();
		conn.close();

	}
}
 