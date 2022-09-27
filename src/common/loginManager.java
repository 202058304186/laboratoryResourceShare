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
		request.setCharacterEncoding("UTF-8");//对请求设定字符集
		response.setContentType("text/html;charset=UTF-8");//对响应设定数据类型和字符集
		PrintWriter out = response.getWriter();//获取响应对象的输出器
		String userName = request.getParameter("userName");//获取请求中的用户名
		String userPassword = request.getParameter("userPassword");//获取请求中的密码
		if (!LoginConfirmer(userName, userPassword)) {
			out.println("数据检索——登录失败！ERROR:LoginConfirmer return the result:false.");
		}//传给登录验证器判断用户名和密码是否正确。
		else {
			out.println("欢迎登录，" + userName + "!<br/>");
			out.println("您的密码为：" + userPassword + "<br/>");
		}
	}
	
	private boolean LoginConfirmer(String userName, String userPassword) {
		
		return true;
	}
}
