package in.edu.tint.it.demo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignUpServet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("I am in Signup");
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("useremail"));
		
		String pass = request.getParameter("userpass");
		String repass =request.getParameter("userrepass");
		if(pass.equalsIgnoreCase(repass)) {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("signup.html");
			rd.forward(request, response);
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
