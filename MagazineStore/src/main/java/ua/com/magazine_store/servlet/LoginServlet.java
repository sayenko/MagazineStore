package ua.com.magazine_store.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.com.magazine_store.domain.User;
import ua.com.magazine_store.service.UserService;
import ua.com.magazine_store.service.impl.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = UserServiceImpl.getUserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("login");
		String password = request.getParameter("password");

		if(!email.isEmpty() && !password.isEmpty()) {
			User user = userService.getUserByEmail(email);
			if (user != null && user.getPassword().equals(password)) {
				request.setAttribute("userEmail", email);
				request.getRequestDispatcher("cabinet.jsp").forward(request, response);
			}
		} else request.getRequestDispatcher("login.jsp").forward(request, response);		 
	}

}
