package servletExample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;

	/**
	 * Default constructor.
	 */
	public Servlet1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		out = response.getWriter();
		System.out.println("doGet Method");
		out.print("doGet\n");
		String text1 = request.getParameter("text1");
		String text2 = request.getParameter("text2");
		
		//validation of username and password
		if ((text1.equals("admin")) && (text2.equals("admin@123"))) {
			out.print("Welcome User");
		} else {
			out.print("Incorrect Username or Password");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		out = response.getWriter();
		System.out.println("doPost Method");
		out.print("doPost\n");
		String text3 =request.getParameter("text3");
		//Factorial
		int n= Integer.parseInt(text3);
		int a=1;
		for(int i=1;i<=n;i++) {
			a=a*i;
		}
		out.print(a);
		String text4 = request.getParameter("text4");
		//check string
				String reverse = "";
				int length = text4.length();
				for (int i = length - 1; i >= 0; i--)
					reverse = reverse + text4.charAt(i);
				if (text4.equals(reverse))
					out.print("\nEntered string is a palindrome.");
				else
					out.print("\nEntered string isn't a palindrome.");
				
				
	}

}