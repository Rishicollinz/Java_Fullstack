package login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginUserServlet
 */
@WebServlet("/")
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginUserDao loginUserDao;

    /**
     * Default constructor. 
     */
    public LoginUserServlet() {
        // TODO Auto-generated constructor stub
    	this.loginUserDao=new LoginUserDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getServletPath();
		try{
			switch(action) {
				case "/login":
					loginCheck(request,response);
					break;
				
			}
		}catch(Exception e) {
			throw new ServletException(e);
		}
	}


	private void loginCheck(HttpServletRequest request, HttpServletResponse response) throws ServletException,SQLException, IOException {
		// TODO Auto-generated method stub

		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Boolean verify=loginUserDao.loginVerify(username, password);
		if(verify==false) {
			System.out.println("false");
			RequestDispatcher dis=request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		}if(verify==true) {
			response.sendRedirect("register.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
