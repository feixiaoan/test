package com.student.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbUtil {
    private static String url = "jdbc:mysql://localhost:3306/easily-j"; // ���ݿ��ַ
    private static String userName = "root"; // ���ݿ��û���
    private static String passWord = "123456"; // ���ݿ�����
    private static Connection conn = null;
    /**
     * ������ݿ�����
     * 
     * @return
     */
    public static Connection getConnection() {
        if (null == conn) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, userName, passWord);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    /**
     * �������ݿ��Ƿ���ͨ
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.err.println(getConnection());
    }
}