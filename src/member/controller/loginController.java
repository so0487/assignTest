package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.MemberService;
import member.service.MemberServiceImpl;

@WebServlet("login")
public class loginController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public loginController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		MemberService memberService = MemberServiceImpl.getInstance();
		String pwd = memberService.getMemberPass(id);
		request.setAttribute("pwd", pwd);
		
		RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
		disp.forward(request, response);
	}
	
}
