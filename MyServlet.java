package KamleshOjha;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String str1= request.getParameter("num1");
		String str2= request.getParameter("num2");
		String str3= request.getParameter("btn1");
		
		//type cast
		int num1= Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
//		int sum= num1+num2;
		
		int ans;
		switch(str3) {
		case "1":
			ans=num1+num2;
			break;
		case "2":
			ans=num1-num2;
			
		
	    case "3":
            ans = num1 * num2;
            break;
        case "4":
         if (num2 != 0) {
             ans = num1 / num2;
        }
        else {
            // Handle division by zero
            response.getWriter().println("Error: Division by zero");
            return;
        }
        break;
    default:
        // Handle unknown operations
        response.getWriter().println("Error: Unknown operation");
        return;
		}
//		response.getWriter().append("Answer ="+" "+ans);
		response.sendRedirect("result.jsp?ans="+ans);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
