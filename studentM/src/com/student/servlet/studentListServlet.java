package com.student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.bean.Student;
import com.student.dao.StudentDao;

@WebServlet("/studentList")
public class studentListServlet extends HttpServlet {
	@Override
	protected void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao studentDao = new StudentDao();
		List<Student> studentList = studentDao.selectStudent();
		req.setAttribute("studentList", studentList);
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
}
