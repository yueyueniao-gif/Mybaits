package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.User;
import service.userservice;
import service.userserviceimpl;

@WebServlet("/showservlet")
public class showservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		userservice use=new userserviceimpl();
		try {
			List<User> list = use.show();
			req.setAttribute("list", list);
			req.getRequestDispatcher("index.jsp").forward(req,resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
