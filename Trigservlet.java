package trigo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Trigservlet
 */
@WebServlet("/Trigservlet")
public class Trigservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Trigservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out =response.getWriter();
		String angleStr = request.getParameter("angle");
		String func = request.getParameter("func");
		
		
		double angle = Double.parseDouble(angleStr);
		double result = 0;
		
		if(func.equals("sin")) {
			result = Math.sin(Math.toRadians(angle));
		}else if(func.equals("cos")) {
			result = Math.cos(Math.toRadians(angle));
		
		}
		else if(func.equals("tan")) {
			result = Math.tan(Math.toRadians(angle));
		}
		else if(func.equals("cot")) {
			result = 1/Math.tan(Math.toRadians(angle));
		}
		else if(func.equals("sec")) {
			result = 1/Math.cos(Math.toRadians(angle));
		}
		else if(func.equals("cosec")) {
			result = 1/Math.sin(Math.toRadians(angle));
		}
		else {
			out.println("Please Select a Proper Function");
		}
		
		out.println("<!DOCTYPE html>\r\n"+ "");
		out.println("<html>");
		out.println("<head>");
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">");
		out.println("<title>Result</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<div class='d-flex justify-center border border-primary rounded shadow p-4' style='transform: translateY(33%)'>");
		out.println("<h1>The Result of "+func+" ("+angle+")"+" is "+result+"</h1>");
		
		
		out.println("</div>");
		out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
