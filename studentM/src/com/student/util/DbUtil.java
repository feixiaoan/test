package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbUtil {
	//���ݿ��ַ
	private static String url = "jdbc:mysql://localhost:3306/xiaofei"; 
    //���ݿ��û���
	private static String userName = "root";
	//���ݿ�����
	private static String passWord = "123456";
	private static Connection conn = null;
	
	/**
	 * ��ȡ���ݿ�����
	 *  
	 *  
	 * @return
	 */
	public static Connection getConnection() {
		if (null ==conn) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, userName, passWord);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	/**
	 * ����ͨ���Ƿ���ͨ
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
