package registrationServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String age=request.getParameter("age");
		String id=request.getParameter("id");
		
		Model model=new Model();
		
		model.setName(name);
		model.setCity(city);
		model.setAge(age);
		model.setId(id);
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		try {
			int rows=model.register();
			if(rows==0) {
				
				response.sendRedirect(request.getContextPath()+"/fail.jsp");
			}
			else {
				response.sendRedirect(request.getContextPath()+"/success.jsp");
			}
		} catch (SQLException e) {
			response.sendRedirect(request.getContextPath()+"/fail.jsp");
			e.printStackTrace();
		}
		
		
	}

}
