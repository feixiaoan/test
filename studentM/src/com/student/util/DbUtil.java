package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbUtil {
	//数据库地址
	private static String url = "jdbc:mysql://localhost:3306/xiaofei"; 
    //数据库用户名
	private static String userName = "root";
	//数据库密码
	private static String passWord = "123456";
	private static Connection conn = null;
	
	/**
	 * 获取数据库连接
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
	 * 测试通道是否连通
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
