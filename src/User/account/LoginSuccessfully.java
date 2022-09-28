package User.account;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSuccessfully
 */
@WebServlet("/login-success")
public class LoginSuccessfully extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSuccessfully() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");//获取请求中的用户名
		String userPassword = request.getParameter("userPassword");//获取请求中的密码
		
		PrintWriter out = response.getWriter();
		out.println("登录成功！<br/>您的用户名为：" + userName + "<br/>");
		out.println("您的密码为：" + userPassword);
	}

}
