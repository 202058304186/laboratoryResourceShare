package User.account;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginManager
 */
@WebServlet("/login-manager")
public class loginManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");//对请求设定字符集
		response.setContentType("text/html;charset=utf-8");
		
		String userName = request.getParameter("userName");//获取请求中的用户名
		String userPassword = request.getParameter("userPassword");//获取请求中的密码
		PrintWriter out = response.getWriter();
		if (!LoginConfirmer(userName, userPassword)) {
			//登录失败处理
			request.getRequestDispatcher("login.html").forward(request, response);
		}
		else {
			request.setAttribute("username", userName);
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
			//登录成功
		}
	}
	
	private boolean LoginConfirmer(String userName, String userPassword) {
		
		return true;
	}
}
