package Text01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Text01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	               throws ServletException,IOException{
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset = utf-8");
		PrintWriter out = resp.getWriter();
		out.println("Hello world!");
	}
}
