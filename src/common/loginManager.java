package common;

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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		if (!LoginConfirmer(userName, userPassword)) {
			out.println("数据检索失败——登录失败！");
		}
		else {
			out.println("欢迎登录，" + userName + "!<br/>");
			out.println("您的密码为：" + userPassword + "<br/>");
		}
	}
	
	private boolean LoginConfirmer(String userName, String userPassword) {
		
		return true;
	}
}
