package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import dao.LoginBean;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO db = new DAO();
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginBean login = new LoginBean();
		
		login.setUser(request.getParameter("user"));
		login.setPass(request.getParameter("pass"));
		System.out.println(login.getUser());
		System.out.println(login.getPass());
		
		boolean loginSuccess = db.verifyLogin(login);
		if(loginSuccess) {
			request.getSession().setAttribute("user", login.getUser());;
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("form-login.jsp");
		}
	}
}
