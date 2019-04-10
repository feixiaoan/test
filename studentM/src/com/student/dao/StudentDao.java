package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.bean.Student;
import com.student.util.DbUtil;

public class StudentDao {
	/**
	 * ����ѧ����Ϣ
	 *  
	 * @return
	 */
	public List<Student> selectStudent() {
		List<Student> studentList = new ArrayList<>();
		Connection  conn = DbUtil.getConnection();
		String sql = "select * from student";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				Student student = new Student();
				student.setStudentId(rst.getInt("student_id"));
				student.setStudentName(rst.getString("student_name"));
				student.setStudentPassword(rst.getString("student_password"));
				student.setStudentSex(rst.getInt("student_sex"));
				student.setStudentNumber(rst.getString("student_number"));
				studentList.add(student);
			}
			rst.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}
	
	/**
	 * ����ѧ����Ϣ
	 * 
	 * @param student
	 * @return
	 */
	public boolean updateStudent(Student student) {
		String sql = "UPDATE student set student_name = ?, student_password = ?, student_sex = ?, student_number = ? WHERE student_id = ?";
		Connection conn = DbUtil.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, student.getStudentName());
			pst.setString(2, student.getStudentPassword());
			pst.setInt(3, student.getStudentSex());
			pst.setString(4,  student.getStudentNumber());
			pst.setInt(5, student.getStudentId());
			int count = pst.executeUpdate();
			pst.close();
			return count > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	/**
	 * ����id��ѯѧ��
	 * @param studentId
	 * @return
	 */
	public Student getStudentById(int studentId) {
		Connection conn = DbUtil.getConnection();
		String sql = "select * from student where student_id = " + studentId;
		Student student = new Student();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while (rst.next()) {
				student.setStudentId(rst.getInt("student_id"));
				student.setStudentName(rst.getString("student_name"));
				student.setStudentPassword(rst.getString("student_password"));
				student.setStudentSex(rst.getInt("student_sex"));
				student.setStudentNumber(rst.getString("student_number"));
			}
			rst.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	/**
	 * ɾ��ѧ����Ϣ
	 * 
	 * @param studentId
	 * @return
	 */
	public boolean deleteStudent(int studentId) {
		String sql = "delete fron student where student_id = ?";
		Connection conn = DbUtil.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, studentId);
			int count = pst.executeUpdate();
			pst.close();
			return count > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * ���ѧ����Ϣ
	 * 
	 * @param student
	 * @return
	 */
	public boolean addStudent(Student student) {
		String sql = "insert into student(student_name,student_password,student_sex,student_number) VALUES(?,?,?,?);";
		Connection conn = DbUtil.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, student.getStudentName());
			pst.setString(2, student.getStudentPassword());
			pst.setInt(3, student.getStudentSex());
			pst.setString(4, student.getStudentNumber());
			int count = pst.executeUpdate();
			return count > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
	}
		return false;
   }
}



